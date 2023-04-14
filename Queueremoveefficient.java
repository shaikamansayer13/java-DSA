//remove efficient O(1);
import java.util.*;
public class Main{
static class Queue{
    static Stack<Integer> s = new Stack<>();
    static  Stack<Integer> r = new Stack<>();

public static boolean isEmpty(){
    return s.isEmpty();
}
public static void add(int item){
    while(!s.isEmpty()){
        r.push(s.pop());
    }
    s.push(item);
    while(!r.isEmpty()){
        s.push(r.pop());
    }
}
public static int remove(){
    if(s.isEmpty()){
        return -1;
    }
    return s.pop();
}
public static int peek(){
       if(s.isEmpty()){
        return -1;
    }
    return s.peek();
}
}

public static void main(String [] args){
    Queue q = new Queue();
    q.add(9);
    q.add(8);
    q.add(7);
    while(!q.isEmpty()){
        System.out.print(q.peek() + " <--");
        q.remove();
    }
}
}
