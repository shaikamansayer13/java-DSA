//linked list
import java.util.*;
class LL{
    
private Node head;
private Node tail;
private int size;

public LL(){
    this.size = size;
}
public void InsertFirst(int val){
Node node = new Node(val);
node.next = head;
head = node;
if(tail == null){
    tail = head;
}
size++;
}
public void InsertLast(int val){
    Node node = new Node(val);
    if(tail == null){
        InsertFirst(val);
        return;
    }
    tail.next = node;
    tail = node;
    size++;
}
public void Insert(int val,int index){
    if(index == 0){
        InsertFirst(val);
        return;
    }
    if(index == size-1){
        InsertLast(val);
        return;
    }
    Node temp = head;
    for(int i = 1;i<index;i++){
        temp = temp.next;
    }
    Node node = new Node(val,temp.next);
    temp.next = node;
    size++;
}
public int deleteFirst(){
    int va = head.val;
    head = head.next;
    if(head == null){
        tail = null;
    }
    size--; 
    return va;
}
public Node get(int index){
 Node node = head;
 for(int i = 0;i<index;i++){
     node = node.next; 
 }
     return node;
}
public int deleteLast(){
    if(size<=1){
        return deleteFirst();
    }
    Node secondlastnode = get(size - 2);
    int valu = tail.val;
    tail = secondlastnode;
    tail.next = null;
    size --;
    return valu;
}
public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.val + "-->");
        temp = temp.next;
    }
    System.out.print("END");
}
public int deletefrom(int index){
    if(index == 0){
         return deleteFirst();
    }
    if(index == size - 1){
        return deleteLast();
    }
    Node prev = get(index - 1);
    int valuu = prev.next.val;
    prev.next = prev.next.next;
    size--;
    return valuu;
}
 class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
    Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
}
}
public class Main{
    public static void main(String [] args){
        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(2);
        list.InsertFirst(8);
        list.InsertFirst(17);
        list.InsertLast(99);
        list.Insert(56,1);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
      // System.out.println(list.deleteFirst());
        //list.display();
        //System.out.println(list.deleteLast());
        //list.display();
       System.out.println(list.deletefrom(2));
        list.display();
    }
}

