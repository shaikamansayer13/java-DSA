//                                              UNION PROBLEM                                                      //

import java.util.*;
public class Main{
    public static void Union(int [] arr1 , int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        
        //array sey uthha set mein dal
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        //array sey utha set mein dal pattha ushar hain duplicate nai letha 
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.print(set);
        System.out.println(set.size());
    }
    public static void main(String [] args){
        int arr1 [] = {1,2,3,4,5,6};
        int arr2 [] = {2,3,4,5,6,7,8};
        Union(arr1,arr2);
    }
}
