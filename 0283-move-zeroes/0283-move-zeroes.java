class Solution {
    public void moveZeroes(int[] nums) {
        int size=nums.length;
         int j=0;
        for(int i=0;i<size;i++){
          
           if(nums[i]!=0 && nums[j]==0){
               int temp=nums[j];
               nums[j]=nums[i];
               nums[i]=temp;
           }
           if(nums[j]!=0){
              j++;
           }
        }
        
    }
}