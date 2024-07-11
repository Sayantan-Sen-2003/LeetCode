class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);

            if(c=='(' || c=='{' || c=='[')
            st.push(c);

            else if((c==')' && st.size()!=0 && st.peek()=='(')||(c=='}' && st.size()!=0 && st.peek()=='{')||(c==']' && st.size()!=0 && st.peek()=='['))
            st.pop();
            else
            return false;
        }
        if(st.size()!=0)
        return false;

        return true;
        
    }
}