import java.util.*;
import java.util.Arrays;

public class Main{
public static void main(String [] args){
    int [] arr = {5,4,3,2,1};
    cyclicsort(arr);
    System.out.println(Arrays.toString(arr));
}
public static void cyclicsort(int [] arr){
    int index=0;
    while(index<arr.length){
        int correctindex = arr[index] - 1;
        if(arr[correctindex]!=arr[index]){
            swap(arr,index,correctindex);
        }
        else{
               index++; 
        }
    }
}
public static void swap(int [] arr,int i,int j){
    int temp =arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
}
}
