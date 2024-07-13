class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int i, n =nums.length;
        int[]nge= new int[n];
    
        Stack<Integer> st=new Stack<>();

        for(i=2*n-1;i>=0;i--){

            while(st.isEmpty()==false && nums[i%n]>=st.peek())
            st.pop();

            if(i<n){
                if(!st.isEmpty()) nge[i]=st.peek();
                else nge[i]=-1;

            }
            st.push(nums[i%n]);

        }
        return nge;
    }
}