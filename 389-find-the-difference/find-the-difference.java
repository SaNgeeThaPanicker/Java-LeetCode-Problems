class Solution {
    public char findTheDifference(String s, String t) {
               char result = 0;
        
        // XOR all characters in both strings
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        
        // The result will be the added letter
        return result;
    }
}