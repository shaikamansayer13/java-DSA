import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    boolean [][] arr = {
	                        {true,true,true},
	                        {true,true,true},
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
	 ///if it survived the if statement and not got returned means i have not visisted that coloumn
	 arr[r][c] = false;
	 if(r>0){
	     maze(p + 'U',arr,r-1,c);
	 }
	 if(c>0){
	     maze(p + 'L',arr,r,c-1);
	 }

	 if(r<arr.length-1){
	     maze(p + 'D',arr,r+1,c);
	 }
	 if(c<arr[0].length-1){
	     maze(p+'R',arr,r,c+1);
	 }
	 //jitta bhi kachara pehlaya khud hi saff kar warna error ayega
	 arr[r][c] = true;
}
}
