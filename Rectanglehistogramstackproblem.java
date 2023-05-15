class Solution {
    public int largestRectangleArea(int[] heights) {
        int [] next = nextsmaller(heights);
        int [] prev = prevsmaller(heights);
        int maxarea = Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int area = (next[i] - prev[i] - 1 ) * heights[i];
            maxarea = Math.max(maxarea,area);
        }
        return maxarea;
    }
        public int[] nextsmaller(int [] heights){
            int [] nextsmall = new int [heights.length]; 
            Stack<Integer> s = new Stack<>();
            for(int i = heights.length-1;i>=0;i--){
                while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                    s.pop();
                }
                if(s.isEmpty()){
                    nextsmall[i] = heights.length;
                }
                else{
                    nextsmall[i] = s.peek();
                }
                s.push(i);
            }
                return nextsmall;
            }
         public int[] prevsmaller(int [] heights){
            int [] prevsmall = new int [heights.length]; 
            Stack<Integer> s = new Stack<>();
            for(int i = 0;i<heights.length;i++){
                while(!s.isEmpty() && heights[i]<=heights[s.peek()]){
                    s.pop();
                }
                if(s.isEmpty()){
                    prevsmall[i] = -1;
                }
                else{
                    prevsmall[i] = s.peek();
                }
                s.push(i);
            }
                return prevsmall;
            }
}
