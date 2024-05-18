class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;

        while(start<end){
            char curfast= s.charAt(start);
            char curlast= s.charAt(end);

            while(Character.isLetterOrDigit(curfast)==false && start<end){
                start++;
                curfast= s.charAt(start);
            }
            while(Character.isLetterOrDigit(curlast)==false && start<end ){
                end--;
                curlast= s.charAt(end);
            }
            if (Character.toLowerCase(curfast) != Character.toLowerCase(curlast)) 
        			return false;
                start++;
                end--;

            
           
        }
        return true;
    }
}