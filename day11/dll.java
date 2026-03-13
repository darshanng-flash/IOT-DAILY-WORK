//double linked list
/*starting node called as head and the last node called as tail  */
package day11;
class DNode{
    int data;
    DNode next;
    DNode prev;
    DNode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}


public class dll {
    DNode head;
    DNode tail;
    void insert_at_end(int data){
    DNode newnode=new DNode(data);
    if(head==null){
        head=newnode;
        tail=newnode;
        return;
    }
    tail.next=newnode;
    newnode.prev=tail;
    tail=newnode;
}
//inserting at the beginning of the linked list
    void insert_at_beginning(int data){
        DNode newnode=new DNode(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    void insert_at_position(int data,int position){
        DNode newnode=new DNode(data);
        if(position==1){
            insert_at_beginning(data);
            return;
        }
        DNode temp=head;
        for(int i=1;i<position-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=newnode;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
    void insert_at_position_end(int data,int position){
        DNode newnode=new DNode(data);
        if(position==1){
            insert_at_beginning(data);
            return;
        }
        DNode temp=head;
        for(int i=1;i<position-1;i++){
            temp=temp.next;
        }
        newnode.prev=temp;
        temp.next=newnode;
        tail=newnode;
    }
    void remove_last(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }
    public static void main(String[] args) {
        dll obj=new dll();
        obj.insert_at_end(10);
        obj.insert_at_end(20);
        obj.insert_at_beginning(5);
        obj.insert_at_position(15,3);
        obj.insert_at_position_end(25,5);
        obj.remove_last();
        //printing the list
        DNode temp=obj.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
