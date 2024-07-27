public class BST_insert
{
    
    private Node root;

    class Node 
    {
        public int value;
        public Node left;
        public Node right;

        Node(int value) 
        {
            this.value = value;
        }
    }

    public Node getRoot() 
    {
        return root;
    }
    public boolean insert(int value) 
    {
        Node newNode = new Node(value);
        if (root == null)
        {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) 
        {
            if (newNode.value == temp.value)
            return false;
            if (newNode.value < temp.value) 
            {
                if (temp.left == null) 
                {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } 
            else 
            {
                if (temp.right == null)
                {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }
    
    public static void main(String args[])
    {
        BST_insert myBST=new BST_insert();
        
        myBST.insert(21);
        myBST.insert(12);
        myBST.insert(32);
        myBST.insert(14);
        myBST.insert(24);
        myBST.insert(10);
        myBST.insert(35);
        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("\nRoot->Left: " + myBST.getRoot().left.value);
        System.out.println("\nRoot->Right: " + myBST.getRoot().right.value);
    }
}

