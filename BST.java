public class BST
{
    Node root;
    class Node
    {
        int value;
        Node left;
        Node right;
        private Node(int value)
        {
            this.value=value;
        }
    }
    public static void main(String args[])
    {
        BST myBST=new BST();
        System.out.println("root ="+myBST.root);
    }
}

