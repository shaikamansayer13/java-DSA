import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    int n =40;
    int p =4;
      double ans = squareroot (n,p);
      System.out.printf("%.4f",ans);
  }
  public static double squareroot (int n, int p)
  {
    int s = 0;
    int e = n;
 
    while (s <= e){  
    int m = s + (e - s) / 2;
	if (m * m == n)
	  {
	    return m;
	  }
     if (m * m < n)
	  {
	    s = m + 1;
	  }
	else
	  {
	    e = m - 1;
	  }
      }
 
  //  double incr = 0.1;
   // for (int i = 0; i < p; i++)
    //  {
//	while (root * root <= n)
//	  {
//	    root += incr;
//	  }
//	root -=  incr;
//	incr /= 10;
  //    }
    //  return root;
    double m = s;
    double dec = 0.1;
    for(int i =0;i<=p;i++){
    while(m*m >=n){
         m = m - dec;
    }
      m = m + dec;
    dec = dec/10;
    }
   return m;
}
}
