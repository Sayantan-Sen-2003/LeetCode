class Solution {
    public String reverseWords(String s) {
        Stack<String> stack= new Stack<>();

        StringBuilder word= new StringBuilder();


        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }
            else if(word.length()>0){
                stack.push(word.toString());
                word.setLength(0);
            }
        }
        if(word.length()>0){
            stack.push(word.toString());
        }

        StringBuilder sent = new StringBuilder();

        while(!stack.isEmpty()){
            sent.append(stack.pop());
            if(!stack.isEmpty())
            sent.append(" ");
        }
        return sent.toString();
}
}