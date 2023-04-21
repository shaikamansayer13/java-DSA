//Binary tree Basics Cleared 
import java.util.*;
public class Main{
static class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
static class Binarytree{
     static int idx = -1;
    public static Node Buildtree(int [] arr){
           idx++;
           if(arr[idx] == -1) {
               return null;
           }
           Node newNode = new Node(arr[idx]); 
           newNode.left = Buildtree(arr);
           newNode.right = Buildtree(arr);
           return newNode;
    }
} 
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }
    //Count most simple problem sirf x+y+1
      public static int Count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = Count(root.left);
        int rightCount = Count(root.right);
        return leftCount + rightCount + 1;
    }
    //height khali max ki gicchi 
       public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }
    
    
    public static void main(String [] args){
    int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    Binarytree tree = new Binarytree();
    Node root = tree.Buildtree(arr);
    //System.out.println(root.data);
    preorder(root);
    System.out.println();
    Inorder(root);
    System.out.println();
    Postorder(root);
    System.out.println();
    levelorder(root);
    System.out.println(sum(root));
    System.out.println(Count(root));
    System.out.println(Height(root));
    }
}
