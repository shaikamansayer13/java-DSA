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
//PREORDER TREE TRAVERSAL(O(n))
//first root then left then right.
    public static void preorder(Node root){
        if(root == null){
            System.out.print("-1" + " ");
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

//IN ORDER TRAVERSAL (O(n))
//First left then root and then left.
 
    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

//POST ORDER TRAVERSAL (O(n))
// Name itself indicates first left then right and lastly root.

public static void Postorder(Node root){
    if(root == null){
        return;
    }
    Inorder(root.left);
    Inorder(root.right);
    System.out.print(root.data);
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
    }
}
