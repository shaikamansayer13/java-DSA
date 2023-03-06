import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
			System.out.println(fact(10));
	}
	public static int fact(int n){
	    if(n==1){
	        return 1;
	    }
	    int factn_1 = fact(n - 1);
	    int fact = factn_1 + n;
	    return fact;
	}
}
