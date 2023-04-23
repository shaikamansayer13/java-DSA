    //we are using oops concept to reduce the time complexity.
    //diameter of the tree
    static class TreeInfo{
        int dia;
        int ht;
        
        TreeInfo(int dia,int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    public static TreeInfo diameter(Node root){
        if(root == null){
         return new TreeInfo(0,0);
        }
    TreeInfo left = diameter(root.left);
    TreeInfo right = diameter(root.right);
    
    int Myheight = Math.max(left.ht,right.ht) + 1;
    int dia1 = left.dia;
    int dia2 = right.dia;
    int dia3 = left.ht + right.ht + 1;
    
    int Mydiameter = Math.max(Math.max(dia1,dia2),dia3);
    TreeInfo myl = new TreeInfo(Mydiameter,Myheight);
    return myl;
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
    System.out.println(diameter(root).dia);
    }
}
