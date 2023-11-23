
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lab_Sessional_2_024{
    public static void main (String args[])
    {
BST tree = new BST();
  
  tree.makeTree();
   
    tree.BST_Insertion(tree.root);

        Boolean parent = tree.printAncestors(tree.root,90);
        
        if(parent == true)
        {
            System.out.println("" + parent);
        }
        
        else if(parent == false)
        {
            System.out.println("parent does not exist ");
        }
        
        System.out.println("" + tree.Construct_Tree(tree.root));
    }

}

//############### Node Class
class Node{
int data;
Node left;
Node right;
Node(){};
Node(int val){
    data=val;}
}

//############### BST Class 
class BST {
    Node root;
  
    Node one,two,three,four,five,six,seven,eight,nine,ten;
    
    void makeTree(){

root = new Node(50);
        Node one = new Node(25);
        Node two = new Node(70);
        Node three = new Node(10);
        Node four = new Node(38);
        Node six = new Node(13);
        Node seven = new Node(90);
        Node eight = new Node(77);
        Node nine = new Node(99);

        root.left = one;
        root.right = two;
        one.left = three;
        one.right = four;
        three.right = six;
        two.right = seven;
        seven.left = eight;
        seven.right = nine;
// add data here
} 
    
 
    Node Construct_Tree(Node newNode)
    {
        Node prev = root;
        int counter = 0;
        int counter1 = 0;
        do
        {
            if(prev.data == newNode.data)
            {
                System.out.println("Duplicate element ");
                return prev;
            }
            
            
            else if (newNode.data < prev.data)
            {
                prev = prev.left;
                
                return prev;
            } 
            
            else if(newNode.data > prev.data)
            {
                prev = prev.right;
                
                return prev;
            }

        }
        
        while(counter == counter1);
        
         if(newNode.data < prev.data)
        {
                prev.left = newNode;
                
                return prev;
         }
        
         else if(newNode.data > prev.data)
        {
                prev.right = newNode;
                
                return prev;
        }
         
        return null;
    }
    
    void BST_Insertion(Node node)
    {
// add code here .. it is ur choice to make a recursive method or not
   if(root == null)
    {
        root = node;
    }
    
    else
    {
        Node temp = root;
        
        while(temp != null)
        {
            if(node.data == temp.data)
            {
                System.out.println("value is inserted as root ");
                return;
            }
            
            else if(node.data < temp.data && temp.left == null)
            {
                temp.left = node;
                
                System.out.println("value is inserted to the left ");
                
                break;
            }
            
            else if(node.data <temp.data)
            {
                temp = temp.left;
            }
            
            else if(node.data > temp.data && temp.right == null)
            {
                temp.right = node;
                
                System.out.println("value is inserted to the right ");
                
                break;
            }
            
            else if(node.data >temp.data)
            {
                temp = temp.right;
            }
        }
    }      
      
        
    }
    
    void printBST(Node root)
{
Queue<Node> queue=new LinkedList<>();
printBST(root,queue);
}
    
    void printBST(Node root,Queue q)
    {
       // add code here according to your exam question .. it is ur choice to make a recursive method or not
         q.add(root);
    
    while(!q.isEmpty())
    {
        root = (Node) q.remove();
        
        System.out.println("" + root.data);
        
        if(root.left != null)
        {
            q.add(root.left);
        }
        
        if(root.right != null)
        {
            q.add(root.right);
        }
    }
    
  }
    Node search(Node root, int val)
    {
        // add code here .. it is ur choice to make a recursive method or not
           
         while(root!=null)
         {
            
            if(root.data == val){
                return root;
            }
            else if(val < root.data){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return null;
    }

    public boolean printAncestors(Node root, int child)
    {

        if (root == null) {
            return false;
        }

        if (root.data == child) {
            return true;
        }
 
       
        boolean left = printAncestors(root.left, child);
 
    
        boolean right = false;
        if (!left) {
            right = printAncestors(root.right, child);
        }

        if (left || right) {
            System.out.print(root.data + " ");
        }
 
     
        return left || right;
    }
}