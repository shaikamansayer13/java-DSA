import java.util.*;
public class Main{

public static void main(String [] args){
      int [] arr ={-2,-3,-4,0,1,14,24,35,64,76,80};
      int target = 67;
      int ans = binarybioler(arr,target);
      System.out.println(ans);
}
public static int binarybioler(int [] arr,int target){
    int start = 0;
    int end = arr.length-1;
   
    while(start<=end){
        // we have to find the mid value
        int mid = start + (end-start) / 2;
        
        if(target<arr[start]){
            end = end -1;
        }
        else if(target>arr[mid]){
            start = mid -1;
        }
        else{
            return mid;
        }
        }
        return -1;
    } 
}
