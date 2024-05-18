class Solution {
    public void rotate(int[] nums, int k) {
           //nums = [1,2,3,4,5,6,7], k = 3 ,n=7
           k=k%nums.length;
           int n=nums.length;

           reverse(nums,0,n-k-1);
            reverse(nums,n-k,n-1);
             reverse(nums,0,n-1);
         
      
    }

    public void reverse(int []nums,int start,int end){

     

        while(start<=end){
            int temp= nums[start];
            nums[start]=nums[end];
            nums[end]= temp;

            start++;
            end--;
        }
    }
}