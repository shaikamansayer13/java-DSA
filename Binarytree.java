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
    public static void main(String [] args){
    int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    Binarytree tree = new Binarytree();
    Node root = tree.Buildtree(arr);
    System.out.println(root.data);
    }
}
