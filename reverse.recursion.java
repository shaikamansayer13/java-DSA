import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("reverse the given number");
		reverse(1234);
		
		System.out.println(sum);
	}
	static int sum = 0;
	public static void reverse(int num){
	    if(num == 0){
	        return;
	    }
	    int rem = num%10;
	        sum = sum * 10 + rem;
	    reverse(num/10);
	}
}
