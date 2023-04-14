//insert efficient O(1);
import java.util.*;
public class Main{
    public static void main(String [] args){
    Queue q = new Queue();
    q.add(9);
    q.add(8);
    q.add(7);
    while(!q.isEmpty()){
        System.out.print(q.remove() + " <--");
    }
}
}
class Queue{
    static Stack<Integer> s = new Stack<>();
    static  Stack<Integer> r = new Stack<>();

public static boolean isEmpty(){
    return s.isEmpty();
}
public static void add(int item){
     s.push(item);
}
public static int remove(){
    
    while(!s.isEmpty()){
        r.push(s.pop());
    }
   int pooped =  r.pop();
    while(!r.isEmpty()){
        s.push(r.pop());
    }
    return pooped;
}
public static int peek(){
       if(s.isEmpty()){
        return -1;
    }
    return s.peek();
}
}





