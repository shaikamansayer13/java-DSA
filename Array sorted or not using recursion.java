import java.util.*;
public class Main{
    public static void main(String [] aman){
    System.out.println("Check whether the array is sorted or not");
    int [] arr = {1,2,3,4,15,6,7,8};
    System.out.println(sort(arr,0));
	}
	public static boolean sort(int [] arr,int index){
	    if(arr[index] == arr.length-1){
	        return true;
	    }
	    return arr[index] < arr[index + 1] && sort(arr,index + 1);
	}
}
