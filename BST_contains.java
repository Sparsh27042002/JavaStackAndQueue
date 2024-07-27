public class BST_contains
{
    Node root;
    class Node
    {
        Node left;
        Node right;
        int value;
        private Node(int value)
        {
            this.value=value;
        }
    }
    public boolean insert(int value)
    {
        Node newNode=new Node(value);
        if(root==null)
        {
            root=newNode;
            return true;
        }
        Node temp=root;
        while(true)
        {
            if(newNode.value==temp.value)
            {
                return false;
            }
            if(newNode.value<temp.value)
            {
                if(temp.left==null)
                {
                    temp.left=newNode;
                    return true;
                }
                temp=temp.left;
            }
            else
            {
                if(temp.right==null)
                {
                    temp.right=newNode;
                    return true;
                }
            }
            temp=temp.right;
        }
    }
    public boolean contains(int value)
    {
        Node temp=root;
        while(temp!=null)
        {
            if(value<temp.value)
            {
                temp=temp.left;
            }
        
            else if(value>temp.value)
            {
                temp=temp.right;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        BST_contains myBST=new BST_contains();
         myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        System.out.println(myBST.contains(27));
        System.out.println(myBST.contains(47));
    }
}

