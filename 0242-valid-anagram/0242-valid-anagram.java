class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a= s.toCharArray();
        char[] b= t.toCharArray();


        int[] freq = new int[26];

        for(char cd: a)
        freq[cd-'a']++;

        for(char cd: b)
        freq[cd-'a']--;


        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)
            return false;
        } 
        return true;
    }


}