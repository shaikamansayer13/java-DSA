/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root,int val){
          if(root.data < val){
          root.right = delete(root.right,val);
      }
      else if(root.data > val){
          root.left = delete(root.left,val);
      }
         else{
          //case 1
          if(root.right ==null && root.left == null){
              return null;
          }
          //case 2
          if(root.left == null){
              return root.right;
          }
          else if(root.right ==null){
              return root.left;
          }
          //case 3
          Node is = inordersuccesor(root.right);
           root.data = is.data;
           root.right = delete(root.right,is.data);
          }
          return root;
      }
      public static Node inordersuccesor(Node root){
          while(root.left != null){
              root = root.left;
          }
          return root;
      }
public static void printinrange(Node root, int X ,int Y ){
    if(root == null){
        return;
    }
    if(root.data>=X && root.data<=Y){
        printinrange(root.left,X,Y);
        System.out.print(root.data + " ");
        printinrange(root.right,X,Y);
    }
    else if(root.data>=Y){
        printinrange(root.left,X,Y);
    }
    else{
        printinrange(root.right,X,Y);
    }
}
   public static void main(String [] args){
       int [] values = {5, 1, 3, 4, 2, 7};
       Node root = null;
       for(int i =0 ;i<values.length;i++){
           root = insert(root,values[i]);
       }
       inorder(root);
       System.out.println();
    //   delete(root,3);
    //   inorder(root);
       printinrange(root,3,10);
   }
}
