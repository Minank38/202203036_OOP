import java.util.*;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    node head;

    void addF(int data) {
        node a = new node(data);
        if (head == null) {
            head = a;
            return;
        }
        a.next = head;
        head = a;
    }

    void dis() {
        node a = head;
        if (head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        System.out.print("Linked list :- ");
        while (a != null) {
            System.out.printf("%d  ", a.data);
            a = a.next;
        }
        System.out.println();
    }

    void addL(int data) {
        node a = new node(data);
        if (head == null) {
            head = a;
            return;
        }
        node b = head;
        while (b.next != null) {
            b = b.next;
        }
        b.next = a;
    }

    void addAt(int i, int data) {
        node a = new node(data);
        if (i == 1 || head == null) {
            addF(data);
            return;
        }
        int c = 1;
        node b = head;
        node d = null;
        while (c < i && b != null) {
            d = b;
            b = b.next;
            c++;
        }
        a.next = b;
        d.next = a;
    }

    void del(int i) {
        node a = head;
        node b = null;
        int c = 1;
        if (i == 1) {
            head = head.next;
            return;
        }
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (c < i && a.next != null) {
            b = a;
            a = a.next;
            c++;
        }
        b.next = a.next;
        a = null;
    }

    int find(int data) {
        int i = 0;
        node a = head;
        while (a != null) {
            if (a.data == data)
                return i;
            i++;
            a = a.next;
        }
        return -1;
    }
}

class L4Q3 {
    public static void main(String[] args) {
        int n, a, i;

        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        System.out.println("1 for add element in linklist at first pos.");
        System.out.println("2 for add element in linklist at last pos.");
        System.out.println("3 for add element in linklist at given pos.");
        System.out.println("4 for delete element in linklist at given pos.");
        System.out.println("5 for display element of linklist");
        System.out.println("6 for find element in linklist");
        System.out.println("7 for exit the program.");

        do {
            System.out.printf("Enter your choice : ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter element which you add in linklist in 1st pos. : ");
                    a = sc.nextInt();
                    list.addF(a);
                    break;
                case 2:
                    System.out.print("Enter element which you add in linklist in last pos. : ");
                    a = sc.nextInt();
                    list.addL(a);
                    break;
                case 3:
                    System.out.print("Enter element which you add in linklist in given pos. : ");
                    a = sc.nextInt();
                    System.out.print("Enter position : ");
                    i = sc.nextInt();
                    list.addAt(i, a);
                    break;
                case 4:
                    System.out.print("Enter index which you delete in linklist : ");
                    i = sc.nextInt();
                    list.del(i);
                    break;
                case 5:
                    list.dis();
                    break;
                case 6:
                    System.out.print("Enter number for finding in linkedlist : ");
                    a = sc.nextInt();
                    if (list.find(a) == (-1)) {
                        System.out.println("Number is not in list");
                    } else {
                        System.out.printf("Number %d is found at index %d\n", a, list.find(a));
                    }
                    break;
                case 7:
                    System.out.println("Khatam tata byy byy gaya...");
                    break;
                default:
                    System.out.println("Unvalid choice");
            }
        } while (n != 7);
    }
}
