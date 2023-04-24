//let's learn HashMap today
//HashMap is a combination of key and values pairs  where Note:- key are unique and values can be duplicate  
//Same this is also unordered as HashSet.
//lets take a real life example 
//                          petrol bunk
//  (fuel)KEY      (Price)VALUE
//   diesel             110
//   petrol             120
//   power petrol       125
//if we want to use anything first we have to import it 
import java.util.*;
public class Hash{
    public static void main(String [] args){
      //lets take an example of the country population 
       //country (key) and populations(values)
       HashMap<String,Integer> map = new HashMap<>();
       
       //lets check insertion 
       //we use put 
       map.put("India",120);
       map.put("China",110);
       map.put("USA",90);
       map.put("Japan",30);
       
       //simply print this
       System.out.println(map);
       
       //if you want to change any country's population 
       map.put("China",130);
       
       System.out.println(map);
       
       //search or lookup
       if(map.containsKey("China")){
           System.out.println("key is present in the map");
       }
       else{
           System.out.println("key is not present in the map");
       }
       
       //if we want to get the value of any key for ex:- i want to check the population of India 
       System.out.print(map.get("India"));   // we get the value of key if the key is present.
       System.out.println();
       System.out.print(map.get("Indonesia")); // this is not present so we got null.
       
       System.out.println();
       
       //lets learn new type of for loop 
       int  [] arr = {1,2,3,4,5};
       for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i]);
       }
       System.out.println();
       //second Method 
       for(int val : arr){
           System.out.print(val);
       }
       
       System.out.println();
       //we learned this new type of for loop becaue we are going to use this in our HashMap 
      
      //for(int val : arr)
      for(Map.Entry<String,Integer> e:map.entrySet()){
          System.out.println(e.getKey());
          System.out.println(e.getValue()); 
      }
      //now lets remove china 
      map.remove("China");
     System.out.println(map);
    }
}
