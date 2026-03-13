//linked list ;concept insert at end and display
package day11;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class sll {
    Node head;
    sll(){
        head = null;
    }
    // inserting at the end of the linked list
        void insert_at_end(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newnode;
            }
        }
        // inserting at the beginning of the linked list
        void insert_at_beginning(int data){              
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }

        //removing the last element of the linked list
        void remove_last(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            if(head.next==null){
                head=null;
                return;
            }
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
        //deleting the first element of the linked list
        void remove_first(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            head=head.next;
        }   
        // reversal of the linked list
        void reverse(){
            Node prev=null;
            Node current=head;
            Node next=null;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            head=prev;
        }


    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }}
 public static void main(String[] args) {
        sll list = new sll();
        list.insert_at_end(10);
        list.insert_at_end(20);
        list.insert_at_end(30);
        list.insert_at_beginning(40);
        list.insert_at_beginning(50);
        list.remove_last();
        list.remove_first();
        list.reverse();
        System.out.println("Linked List:");
        list.display();
    }
}