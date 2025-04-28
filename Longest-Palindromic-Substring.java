class Solution {
    public String longestPalindrome(String str) {
        int l=str.length();
        if (l <= 1)
      return str;

    String LPS = "";

    for (int i = 1; i < l; i++) {
      //  odd length checking
      int low = i;
      int high = i;
      while(str.charAt(low) == str.charAt(high)) {
        low--;
        high++;

        if (low == -1 || high == l)
          break;
      }

      String palindrome = str.substring(low+1, high);
      if (palindrome.length() > LPS.length()) {
        LPS = palindrome;
      }

      //  even length checking
      low = i-1;
      high = i;
      while(str.charAt(low) == str.charAt(high)) {
        low--;
        high++;

        if (low == -1 || high == l)
          break;
      }

      palindrome = str.substring(low+1, high);
      if (palindrome.length() > LPS.length()) {
        LPS = palindrome;
      }
    }

    return LPS;
    }
}