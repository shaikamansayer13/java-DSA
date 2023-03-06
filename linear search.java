import java.util.*;
public class Main{
    public static void main(String [] aman){
    System.out.println("Check whether the array is sorted or not");
    int [] arr = {1,2,3,4,15,6,7,8};
    System.out.println(sort(arr,50,0));
	}
	public static int sort(int [] arr,int target,int index){
	    if(arr[index] == target){
	        return index;
	    }
	    if(arr[index]!= target && index < arr.length-1){
	    return  sort(arr,target,index + 1);
	}
	return -1;
}
}
