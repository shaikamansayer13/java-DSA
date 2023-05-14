class Solution {
    public List<List<Integer>> subsets(int[] nums) { 
        List<List<Integer>> result = new ArrayList<>(); //creating new arraylist of arraylist
        backtrack(result,new ArrayList<>(),nums,0); //calling another helper function 
        return result;
    }
    private void backtrack(List<List<Integer>> result ,List<Integer> subset,int [] nums,int start){
        result.add(new ArrayList<>(subset)); //Adding an empty set as question says
        for(int i=start;i<nums.length;i++){  //simple for loop
            subset.add(nums[i]);    //adding the number 
            backtrack(result,subset,nums,i+1);  //calling the function 
            subset.remove(subset.size()-1);    //not adiing the number 
        }
    }
}

