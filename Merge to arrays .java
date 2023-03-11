import java.util.*;
import java.util.Arrays;

public class Main{
    public static void main(String [] args){
      int [] l = {5,4,3,2,1};
      int [] r = {1,2,3,4,5};
       int [] mix = new int [l.length + r.length];
      System.out.println(Arrays.toString(merge(l,r,mix)));
    }
    public static int [] merge(int [] l,int [] r,int [] mix){
        int i = 0;
        int j = 0;
        int k =0;
        while(i<l.length && j<r.length){
            if(l[i] < r[j]){
                mix[k] = l[i];
                i++;
            }
            else{
                mix[k] = r[j];
                j++;
            }
            k++;
        }
        while(i<l.length){
            mix [k] = l[i];
            i++;
            k++;
        }
          while(j<r.length){
            mix [k] = r[j];
            j++;
            k++;
        }
        return mix;
    }
}
