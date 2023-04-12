import java.util.*;
class LL{
    Scanner sc=new Scanner(System.in);
    Node head;
    public void addF(int data){
        Node a=new Node(data);
        if(head==null)
        {
            head=a;
            return;
        }
        a.next=head;
        head=a;
    }
    public void addL(int data){
        Node a=new Node(data);
        if(head==null)
        {
            head=a;
            return;
        }
        Node b=head;
        while(b.next!=null){
            b=b.next;
        }
        b.next=a;
    }
    public void dis(){
        Node a=head;
        while(a!=null)
        {
            System.out.print(a.data+" ");
            a=a.next;
        }
        System.out.println();
    }
    public void addAt(int i,int data){
        Node a=new Node(data);
        if(i==1)
        {
            addF(data);
            return;
        }
        int c=1;
        Node aft=head;
        Node pre=null;
        while(c<i&&aft!=null){
            pre=aft;
            aft=aft.next;
            c++;            
        }
        a.next=aft;
        pre.next=a;
    }
    public void del(int i){
        if(i==1){
            head=head.next;
            return;
        }
        int c=1;
        Node a=head;
        Node b=null;
        while(c<i&&a.next!=null){
            b=a;
            a=a.next;
            c++;
        }
        b.next=a.next;
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class L4Q2 {
    public static void main(String args[]){
        LL list=new LL();
        list.dis();
        list.addF(38);
        list.dis();
        list.addF(83);
        list.dis();
        list.addL(64);
        list.dis();
        list.addAt(1,36);
        list.dis();
        list.del(1);
        list.dis();
    }
}
