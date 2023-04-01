import java.util.*;

class Mai{
    
    private int [] data;
    private static int siz = 10;
    private int size =0;
    public Mai(){
        this.data = new int [siz];
    }
    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++] = num;
    }
    public boolean isfull(){
        return size == data.length;
    }
    public void resize(){
        int [] temp = new int [data.length*2];
        for(int i =0 ; i<=data.length-1;i++){
            temp[i] = data[i];
        }
         data = temp;
    }
    public int remove(){
        int remove = data[--size];
        return remove;
    }
    public int set(int index,int value){
        return data[index] = value;
    }
    public int get(int index){
        return data[index];
    }
        @Override
        public String toString(){
        return Arrays.toString(data);
    }
}
    public class Main{
    public static void main(String [] args){
    Mai list = new Mai();
    list.add(4);
    list.add(3);
    list.add(6);
    for(int i = 0 ;i<=13;i++){
        list.add(2*i);
    }
    System.out.println(list);
   // System.out.println(list.get(2));
    }
}
