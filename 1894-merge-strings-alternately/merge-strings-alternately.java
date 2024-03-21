class Solution {
    public String mergeAlternately(String word1, String word2) {
        String demoString1 = word1;
        String demoString2 = word2;
        StringBuilder merged = new StringBuilder();
        int i=0,j=0;
        while (i<demoString1.length()&& j<demoString2.length())
        {
            merged.append(demoString1.charAt(i++));
            merged.append(demoString2.charAt(j++));

        }
        while (i<demoString1.length()){
            merged.append(demoString1.charAt(i++));
        }
        while (j<demoString2.length())
        {
            merged.append(demoString2.charAt(j++));
        }
        return merged.toString();
}
}
