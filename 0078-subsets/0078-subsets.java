class Solution {
    List<List<Integer>> ans= new  ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> path= new ArrayList<>();
        int n=0;
        subsequence(nums,path,ans,n);
        return ans; 
    }

    void subsequence(int[] nums, List<Integer> path, List<List<Integer>> ans,int n){
            if(n==nums.length){
               ans.add(new ArrayList<>(path));
               //ans.add(path); //not working
               return;
            }
            path.add(nums[n]);
            subsequence(nums,path,ans,n+1);
            path.remove(Integer.valueOf(nums[n]));
            subsequence(nums,path,ans,n+1);


    }
}