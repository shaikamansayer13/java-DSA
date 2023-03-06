import java.util.*;
public class Main{
    public static void main (String [] aman){
    int ans = pro(1324);
    System.out.println(ans);
    }
    public static int pro(int n){
        if(n%10==n){
            return n;
        }
        return  n % 10 * pro(n / 10);
    }
}
