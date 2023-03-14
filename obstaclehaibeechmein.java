import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    boolean [][] arr = {
	                        {true,true,true},
	                        {true,false,true},
	                        {true,true,true}
	    };
	maze("",arr,0,0);
	}
	public static void maze(String p,boolean [][] arr,int r,int c){
	 if(r==arr.length-1 && c==arr[0].length-1){
	    System.out.println(p);
	    return;
	 }
	    
	 if(!arr[r][c]){
	     return;
	 }
	 if(r<arr.length-1){
	     maze(p + 'D',arr,r+1,c);
	 }
	 if(c<arr[0].length-1){
	     maze(p+'R',arr,r,c+1);
	 }
}
}
