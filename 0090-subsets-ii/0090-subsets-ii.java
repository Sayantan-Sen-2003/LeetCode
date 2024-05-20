class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        int index=0;
        Arrays.sort(nums);
        subset(index,nums,ans,new ArrayList<>());
        return ans;
    }

    void subset(int index,int[]nums,List<List<Integer>>ans,ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1])continue;

            ds.add(nums[i]);
            subset(i+1,nums,ans,ds);
            ds.remove(Integer.valueOf(nums[i]));


        }
    }
}