class Solution {
    public boolean isValid(String s) {
        Stack<Character> abc= new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                abc.push(c);
            }
            else{
                if(abc.isEmpty())
                return false;
                else {
                    char top=abc.peek();
                    if((c==')' &&top=='(') || (c=='}' &&top=='{') || (c==']' &&top=='[')){
                        abc.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return abc.isEmpty();
    }
}