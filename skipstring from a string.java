import java.util.*;
import java.util.Arrays;

public class Main{
    public static void main(String [] args){
    String up = "abbbapplekjf";
    System.out.println(skip(up));
    }
    public static String  skip (String up){
        if(up.isEmpty()){
            return "";
        }
      String jump = "apple";
        if(up.startsWith(jump)){
            return skip(up.substring(jump.length()));
        }
        else{
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}
