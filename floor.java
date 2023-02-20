import java.util.*;
public class Main{

public static void main(String [] args){
      int [] arr ={1,2,4,6,7,9,14,16,17};
      int target = 0;
      int ans = binarybioler(arr,target);
      System.out.println(ans);
}
public static int binarybioler(int [] arr,int target){
    
    int start = 0;
    int end = arr.length-1;
    if(arr[start]>target){
        return -1;
    }
     while(start<=end){
        int mid = start + (end-start) / 2;
      if(arr[mid]<target){
          start = mid + 1;
      }
      else if(arr[mid]>target){
          end = mid-1;
      }
      else{
          return mid;
      }
     }
     return end;
}
}
