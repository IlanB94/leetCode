public static String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";
    String longest = "";

    for (int center = 0; center < s.length(); center++) {
        // Odd length palindromes
        String oddPalindrome = expandAroundCenter(s, center, center);
        // Even length palindromes
        String evenPalindrome = expandAroundCenter(s, center, center + 1);
        
        // Find the longer of the two palindromes
        String longerPalindrome = oddPalindrome.length() > evenPalindrome.length() ? oddPalindrome : evenPalindrome;

        // Update the longest palindrome found
        if (longerPalindrome.length() > longest.length()) {
            longest = longerPalindrome;
        }
    }

    return longest;
}

// Helper method to expand around a center and return the palindrome
private static String expandAroundCenter(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
    }
    // Substring from (left + 1) to right is the valid palindrome
    return s.substring(left + 1, right);
}
