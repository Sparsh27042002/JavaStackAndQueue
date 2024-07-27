import java.util.Queue;

public class queue_enqueue
{
    private Node first;
    private Node last;
    private int length;
    class Node
    {
        int value;
        Node next;
        Node(int value)
        {
            this.value=value;
        }
    }
    public queue_enqueue(int value)
    {
        Node newNode=new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }
    public void printQueue()
    {
        Node temp=first;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void enqueue(int value)
    {
        Node newNode=new Node(value);
        if(length==0)
        {
            first=newNode;
            last=newNode;
        }
        else
        {
            last.next=newNode;
            last=newNode;
        }
        length++;
    }
    public static void main(String args[])
    {
        queue_enqueue myqueue=new queue_enqueue(1);
        myqueue.enqueue(2);
        myqueue.printQueue();
    }
}
