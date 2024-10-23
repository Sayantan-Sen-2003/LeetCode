class Solution {
    public int majorityElement(int[] nums) {
        int count=0, count1=0,element=0, n= nums.length;

            for(int i=0;i<n;i++){
                
                if(count==0){
                    element = nums[i];
                    count=1;
                }
                else if(nums[i]==element )
                count++;

                else 
                count--;

            }

            if(count>0){
                
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==element)
                    count1++;
                }
                if(count1> n/2)
                return element;
            }
            else{
                return -1;
            }
        return -1;
    }
}