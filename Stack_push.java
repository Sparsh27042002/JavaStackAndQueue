public class Stack_push
{
    private Node top;
    private int height;
    class Node
    {
        int value;
        Node next;
        public Node(int value)
        {
            this.value=value;
        }
    }
    public Stack_push(int value)
    {
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }
    public void printStack()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void push(int value)
    {
        Node newNode=new Node(value);
        if(height==0)
        {
            top=newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }
    }
    public static void main(String args[])
    {
        Stack_push myStack=new Stack_push(4);
        myStack.push(3);
        myStack.printStack();
    }
}
