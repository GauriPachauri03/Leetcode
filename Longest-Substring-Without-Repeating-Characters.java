class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int left = 0, right = 0; right < s.length(); right++) {
            char c = s.charAt(right); // Current right pointer character
            
            if (map.containsKey(c)) {
                left = Math.max(map.get(c) + 1, left); // updating left pointer if character repeates
            }
            
            map.put(c, right);//storing value of right pointer in map
            max = Math.max(max, right - left + 1); // Checking for maximum length of substring
        }
        
        return max;
    }
}