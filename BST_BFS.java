import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BST_BFS
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
    public ArrayList<Integer> BFS()
    {
        Node currentNode=root;
        Queue<Node> queue=new LinkedList<>();
        ArrayList<Integer> results=new ArrayList<>();
        queue.add(currentNode);
        while(queue.size()>0)
        {
            currentNode=queue.remove();
            results.add(currentNode.value);
            if(currentNode.left!=null)
            {
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null)
            {
                queue.add(currentNode.right);
            }
        }
        return results;
    }
    public static void main(String args[])
    {
        BST_BFS myBST=new BST_BFS();
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);
        System.out.println(myBST.BFS());
    }
}
