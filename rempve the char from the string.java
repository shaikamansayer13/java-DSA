import java.util.*;
import java.util.Arrays;

public class Main{
    public static void main(String [] args){
    String up = "abbbiejfkjf";
    skip("",up);
    }
    public static void skip (String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p + ch,up.substring(1));
        }
    }
}
// with return type
import java.util.*;
import java.util.Arrays;

public class Main{
    public static void main(String [] args){
    String up = "abbbiejfkjf";
    System.out.println(skip(up));
    }
    public static String  skip (String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'i'){
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }
  //ok now i want to change any element .ex from i to k 
  import java.util.*;
import java.util.Arrays;

public class Main{
    public static void main(String [] args){
    String up = "abbbiejfkjf";
    System.out.println(skip(up));
    }
    public static String  skip (String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
      char  b = 'k';
        if(ch == 'i'){
            return b + skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }
