//                                              Intersection PROBLEM                                                      //

import java.util.*;
public class Main{
    public static void Intersection(int [] arr1 , int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
       //Array mein sey lekey set mein phek miya elements
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
      //Second array key elements ku Contains ki madad sey set mein check karr agar hain to print ya count++ --> print count
        for(int i=0;i<arr2.length;i++){
           if(set.contains(arr2[i])){
            count++;
           // System.out.print(arr2[i] + " ");
            set.remove(arr2[i]);
           }
        }
        // System.out.println(set);
        // System.out.println(set.size());
        System.out.println(count);
    }
    public static void main(String [] args){
        int arr1 [] = {1,2,3,4,5,6,7};
        int arr2 [] = {1,2,3,4,5,6};
        Intersection(arr1,arr2);
    }
}
