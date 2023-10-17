package main.advancelevel;

public class singlelinklist {

    class Node{
        int data;
        Node next=null;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public Node head=null;
    public Node tail=null;


public void addNode(int data){

   Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
}


public void display()
{
    Node current = head;
    if(head == null) {
        System.out.println("List is empty");
        return;
    }
    System.out.println("Nodes of singly linked list: ");
    while(current != null) {
        //Prints each node by incrementing pointer
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}


    public static void main(String []args){
        singlelinklist sl=new singlelinklist();
        sl.addNode(1);
        sl.addNode(2);
        sl.addNode(3);
        sl.addNode(4);

        sl.display();


    }
}
