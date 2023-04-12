#include <iostream>
using namespace std;
class node
{
public:
    int data;
    node *next;
    node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
};
void addF(node *&head, int data)
{
    node *a = new node(data);
    if (head == NULL)
    {
        head = a;
        return;
    }
    a->next = head;
    head = a;
}
void addL(node *&head, int data)
{
    node *a = new node(data);
    if (head == NULL)
    {
        head = a;
        return;
    }
    node *l = head;
    while (l->next != NULL)
    {
        l = l->next;
    }
    l->next = a;
}
void addAt(node *&head, int i, int data)
{
    node *a = new node(data);
    if (i == 1)
    {
        addF(head, data);
        return;
    }
    node *p = NULL;
    node *l = head;
    int c = 1;
    while (c < i && l != NULL)
    {
        p = l;
        l = l->next;
        c++;
    }
    p->next = a;
    a->next = l;
}
void del(node *&head, int i)
{
    node *a = head;
    if (head == NULL)
    {
        cout<<"List is empty\n";
        return;
    }
    if (i == 1)
    {
        head = head->next;
        return;
    }
    int c = 1;
    node *b = NULL;
    while (c < i && a->next != NULL)
    {
        b = a;
        a = a->next;
        c++;
    }
    b->next = a->next;
    a = NULL;
}
void dis(node *&head)
{
    node *a = head;
    if (head == NULL)
    {
        cout<<"Linkedlist is empty\n";
        return;
    }
    printf("Linkedlist :- ");
    while (a != NULL)
    {
        cout<<a->data<<" ";
        a = a->next;
    }
    cout<<"\n";
}
int main()
{
    int n, a, i;
    cout<<"Enter head element : ";
    cin >> n;
    node *head = new node(n);
    cout<<"1 for add element in linklist at first pos.\n"<<"2 for add element in linklist at last pos.\n"<<"3 for add element in linklist at given pos.\n"<<"4 for delete element in linklist at given pos.\n"<<"5 for display element of linklist\n"<<"6 for exit the program.\n"<<endl;
    do
    {
        cout<<"Enter your choice : ";
        cin >> n;
        switch (n)
        {
        case 1:
            cout<<"Enter element which you add in linklist in 1st pos. : ";
            cin >> a;
            addF(head, a);
            break;
        case 2:
            cout<<"Enter element which you add in linklist in last pos. : ";
            cin >> a;
            addL(head, a);
            break;
        case 3:
            cout<<"Enter element which you add in linklist in given pos. : ";
            cin >> a;
            cout<<"Enter position : ";
            cin >> i;
            addAt(head, i, a);
            break;
        case 4:
            cout<<"Enter index which you delete in linklist : ";
            cin >> i;
            del(head, i);
            break;
        case 5:
            dis(head);
            break;
        case 6:
            cout<<"Khatam tata byy byy gaya...\n";
            break;
        default:
            cout<<"Unvalid choice,try again\n";
        }
    } while (n != 6);

    return 0;
}
