class Solution {
    public int maxProduct(int[] nums) {
        int suffix=1,preffix=1,maxpro=Integer.MIN_VALUE;
        int n= nums.length;
        for(int i=0;i<n;i++){

            preffix= preffix * nums[i];
            suffix=suffix*nums[n-1-i];

            maxpro=Math.max(maxpro,Math.max(preffix,suffix));

            if(suffix==0) suffix=1;
             if(preffix==0) preffix=1;
        }
        return maxpro;
    }
}