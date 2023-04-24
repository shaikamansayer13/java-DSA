
//lets start today with hasset
//its normally a set in which no dublicates are allowed.
//it is a data structure in which we have unique elements.simply known as HashSet.
//its important data structure because of the timecomplexity.
//add O(1).
//contains O(1).
//remove O(1).

// import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
public class Hash
{
  public static void main (String[]args)
  {
    HashSet < Integer > set = new HashSet <> ();
    //same synatax as we do in arraylist.
    //lets learn insert
    set.add (1);
    set.add (2);
    set.add (3);
    set.add (1);		//this is dublicate it will not be stored in the HashSet

    //lets search
    if (set.contains (1))
      {
	System.out.println ("Set contains 1");
      }
    else
      {
	System.out.println ("Set doesn't contains 1 ");
      }

    //lets remove
    set.remove (1);
    if (!set.contains (1))
      {
	System.out.println ("Set doesn't contains 1 ");
      }

    //lets check the size.
    System.out.println ("the size of the set is: " + set.size ());

    //Suppose i want to print whole set , Hey it is again very much simple
    System.out.println (set);

    //Iterator and iterator() in HashSet.
    //Note :- HashSet doesn't have any indxing so how can we iterate through the HashSet so for this we have to Import the java.util.Iterator
    Iterator it = set.iterator();  //this is some kind of new concept to me.
    //in this iterator function we have //hasNext and //next.
    //it.HasNext() will give the boolean output.
    //it.next() will give the next after the null exanmple:-  NUll -->1 -->2 -->3 
    //Now we can use the loops 
    // this is neither sorted nor ordered any thing can come first.because as we study  HashSet is Unordered.
    while(it.hasNext()){
        System.out.print(it.next() + " ");
    }
  }
}
