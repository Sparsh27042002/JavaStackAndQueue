
public class Stack_pop
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
    public Stack_pop(int value)
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
    public Node pop()
    {
        if(height==0)
        {
            return null;
        }
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }
    public static void main(String args[])
    {
        Stack_pop myStack=new Stack_pop(7);
        myStack.push(23);
        myStack.push(3);
        myStack.push(11);
        myStack.pop();
        myStack.printStack();
    }
}