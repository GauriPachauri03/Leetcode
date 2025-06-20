class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLength=0;
        for(int num:arr){
            int prev = num - difference;
            int length = dp.getOrDefault(prev,0)+1;
            dp.put(num,length);
            maxLength= Math.max(length, maxLength);
        }
        return maxLength;
    }
}