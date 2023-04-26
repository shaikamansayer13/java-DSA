/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*; 
public class Main{
    public static void printmajority(int [] nums){
    HashMap<Integer,Integer> map = new HashMap<>();
    int n= nums.length;
    for(int i =0;i<n;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i]) +  1);
        }
        else{
            map.put(nums[i],1);
        }
    }
    
    for(int key : map.keySet()){
        if(map.get(key) > n/3){
            System.out.print(key + " ");
        }
    }
    }
    public static void main(String[] args){
        int [] nums = {1,3,2,5,1,3,1,5,1};
       // int [] numss = {1,2};
        printmajority(nums);
    }
}
