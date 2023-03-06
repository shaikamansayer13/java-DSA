import java.util.*;
public class Main{
    public static void main (String [] aman){
    int ans = sum(1324);
    System.out.println(ans);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return  n % 10 + sum(n / 10);
    }
}
