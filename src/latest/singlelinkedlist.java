package latest;

public class singlelinkedlist {
    class Node{
        int data;
        Node next=null;
          public Node(int data)
          {
              this.data=data;
              this.next=null;
          }

    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int data)
    {
       Node newnode=new Node(data);
       if(head==null)
       {
           head=newnode;
           tail=newnode;
       }
       else
       {
           tail.next=newnode;
           tail=newnode;
       }

    }


    public void display(){
        Node current=head;
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        System.out.println("Node of Single linked List");
        while(current!=null)
        {
            System.out.println(current.data+"  ");
            current=current.next;
        }
        System.out.println();

    }

    public static void main(String args[])
    {
        singlelinkedlist s1=new singlelinkedlist();
        s1.addNode(1);
        s1.addNode(2);
        s1.addNode(3);
        s1.addNode(4);
        s1.addNode(5);
        s1.addNode(6);
        s1.display();
    }
}
