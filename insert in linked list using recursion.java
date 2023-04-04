import java.util.*;
class LL{
    
private Node head;
private Node tail;
private int size;

public LL(){
    this.size = size;
}
public void insertrec(int val,int index){
    head = insertrec(val,index,head);
}
private Node insertrec(int val,int index,Node node){
    if(index == 0){
        Node temp = new Node(val,node);
        size++;
        return temp;
    }
     node.next = insertrec(val,index-1,node.next);
      return node;
}
public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.val + "-->");
        temp = temp.next;
    }
    System.out.print("END");
}
  public class Main{
    public static void main(String [] args){
        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(2);
        list.InsertFirst(8);
        list.InsertFirst(17);
        // list.InsertLast(99);
        // list.Insert(56,1);
        // list.display();
        // System.out.println(list.deleteFirst());
        // System.out.println(list.deleteLast());
      // System.out.println(list.deleteFirst());
        //list.display();
        //System.out.println(list.deleteLast());
        //list.display();
    //   System.out.println(list.deletefrom(2));
        list.insertrec(88,2);
        list.display();
    }
}
