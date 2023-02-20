import java.util.*;
public class Main{

public static void main(String [] args){
      int [] arr ={-1,2,3,4,5,6,7,8};
      int target = -1;
      boolean desoraes = des(arr);
      System.out.println(desoraes);
      int ans = binarybioler(arr,target,desoraes);
      System.out.println(ans);
}
public static boolean des(int [] arr){
    int start = 0;
    int end = arr.length-1;
    if(arr[start]>arr[end]){
        return true;
    }
    else{
        return false;
    }
}
public static int binarybioler(int [] arr,int target,boolean desoraes){
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
    
        int mid = start + (end-start) / 2;
        if(target ==arr[mid]){
            return mid;
        }
        
        if(!desoraes){
        if(target<arr[mid]){
            end = mid -1;
        }
        else{
            start = mid + 1;
        }
        }
         else if(desoraes){
        if(target>arr[mid]){
            end = mid -1;
        }
        else{
            start = mid + 1;
        }
        }
    }
     return -1;
}
}
