import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class LL{
    node head;
    void add(int data){
        node a=new node(data);
        if(head==null)
        {
            head=a;
            return;
        }
        node c=head;
        while(c.next!=null)
        {
            c=c.next;
        }
        c.next=a;
    }
    void dis(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        node a=head;
        while(a!=null){
            System.out.printf("%d  ",a.data);
            a=a.next;
        }
        System.out.println();
    }
    void op(int x){
        node a=head;
        int c=1;
        while(a!=null){
            if(a.data>x)
            {
                del(c);
                c--;
            }
            c++;
            a=a.next;
        }
    }
    void del(int i){
        if(i==1){
            head=head.next;
            return;
        }
        int c=1;
        node p=null;
        node a=head;
        while(c<i){
            p=a;
            a=a.next;
            c++;
        }
        p.next=a.next;
        a=null;
    }
}
public class L4Q4 {
    public static void main(String[] args){
        LL a=new LL();
        int n,t;
        Scanner sc=new Scanner (System.in);
        System.out.print("How many number you want to enter : ");
        n=sc.nextInt();
        while(n--!=0){
            System.out.print("Enter element of linkedlist : ");
            t=sc.nextInt();
            a.add(t);
        }
        System.out.println("Original linkedlist");
        a.dis();
        System.out.print("Enter limit number : ");
        int x=sc.nextInt();
        System.out.println("Linklist after operation");
        a.op(x);
        a.dis();
    }
}
