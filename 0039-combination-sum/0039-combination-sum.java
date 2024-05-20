class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        int index=0;
        findcombination(index,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void findcombination(int index, int[]arr,int target,List<List<Integer>>ans, List<Integer>ds){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
                
            }
            return;
        }
        //pick
        if(arr[index]<=target)
        {
            ds.add(arr[index]);
            findcombination(index,arr,target-arr[index],ans,ds);
            ds.remove(Integer.valueOf(arr[index]));// ds.remove(ds.size()-1);
        }
        //we picked and so, we added,  but then we removed it 
        // now we dont pick and move to next index
        findcombination(index+1,arr,target,ans,ds);
    }
}