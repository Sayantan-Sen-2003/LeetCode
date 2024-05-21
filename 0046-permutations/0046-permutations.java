class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index =0;
        findPermutation(index, nums,ans);
        return ans;
    }
    public void findPermutation(int index,int[]nums,List<List<Integer>> ans){
            if(index==nums.length){
                List<Integer> ds= new ArrayList<>();
                for(int i=0;i<nums.length;i++){
                    ds.add(nums[i]);
                }
                ans.add(new ArrayList<>(ds));
                return;
            }
        for(int i=index;i<nums.length;i++){
            swapp(i,index,nums);
            findPermutation(index+1, nums,ans);
            swapp(i,index,nums);
        }
    }
    void swapp(int i,int index,int[]nums){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
}