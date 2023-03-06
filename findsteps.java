import java.util.*;
public class Main
{
	public static void main(String[] args) {
	System.out.println("COUNT THE NUMBER OF ZEROS");
    System.out.println(count(14,0));
	}
	public static int count(int num,int co){
	if(num == 0){
	    return co;
	}
	if(num%2 == 0){
	    return count(num / 2, co + 1);
	}
	else{
	    return count(num - 1, co + 1);
	}
}
}
