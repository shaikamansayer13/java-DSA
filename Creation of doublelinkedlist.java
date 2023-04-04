//creation of double linked list.
import java.util.*;
class DLL{
    private Node head;
    private Node tail;
    private int size;
    DLL(){
       this.size = size; 
    }
     public void InsertFirst(int val){
     Node node = new Node(val);
     node.next = head;
     node.prev = null;
     if(head != null){
     head.prev = node;
     }
    head = node;     
     size ++;
    }
    public void InsertLast(int val){
        Node node = new Node(val);
        Node temp = head;
           if(head == null){
             node.prev = null;
             head = node;
        }
        while(temp.next!=null){
             temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        node.prev = temp;
        size++;
    }
    public void InsertFrom(int val, int index){
        if(index == 0){
           InsertFirst(val);
           return;
        }
        if(index == size - 1){
            InsertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size ++;
    }
    public Node find (int val){
        Node temp = head;
        while(temp != null){
            if(temp.val == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void insertafter(int after,int val){
        Node p = find(after);
        if(p== null){
            System.out.println("Not found");
            return;
        }
        Node node =  new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev= p;
        if(node.next != null){
        node.next.prev = node;
    }
    size++;
    }
    public void insertbefore(int before,int val){
        Node p = find(before);
        if(p == null){
            System.out.println("Not found");
        }
        Node node =  new Node(val);
        node.next = p;
        node.prev =p.prev;
        if(p.prev == null){
            head = node;
        }
        else{
            p.prev.next = node;
        }
        p.prev = node;
         size++;
        }
    public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.val +"-->");
        temp = temp.next;
    }
    System.out.print("END");
    }
}
    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        Node(int val,Node next){
             this.val = val;
             this.next = next;
             this.prev = prev;
        }
    }
public class Main{
    public static void main(String [] args){
        DLL list = new DLL();
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(4);
        list.InsertLast(94);
        list.InsertFrom(32,2); 
        list.insertafter(4,54);
        list.insertbefore(3,12);
        list.display();
    }
}
