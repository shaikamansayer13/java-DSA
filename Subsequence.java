//sub sequence 
import java.util.*;
import java.util.Arrays;

public class Main
{
  public static void main (String[]args)
  {
    String str = "abc";
      subseq (str, "");
  }
  public static void subseq (String str, String newstr)
  {
    if (str.isEmpty ())
      {
	System.out.println (newstr);
	return;
      }
    char ch = str.charAt (0);
    subseq (str.substring (1), ch + newstr);
    subseq (str.substring (1), newstr);
  }
}
