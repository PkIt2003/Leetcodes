// 1051. Height Checker//
class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int [] dup = Arrays.copyOf(heights,heights.length);
        Arrays.sort(dup);
        for(int i=0;i<(heights.length);i++){
            if(heights[i]!=dup[i]){
                count++;
            }
        }
        return count;
    }
}