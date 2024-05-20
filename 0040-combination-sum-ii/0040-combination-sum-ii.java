class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(candidates); // sorting to get this sequence
        findcombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    // 1 1 1 1  2 2 2
    void findcombination(int index, int[]arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
           return;
        }
        for(int i=index;i<arr.length;i++){
            //for the next index,if it is = to the previous index ,simply skip
            if(i>index && arr[i]==arr[i-1]) continue;
            //if target has shrunk,such that next element is bigger , no point in continuing
            if(arr[i]>target) break;

            //else
            ds.add(arr[i]);
            findcombination(i+1,arr,target-arr[i],ans,ds);
            ds.remove(Integer.valueOf(arr[i]));

        }
    }
}