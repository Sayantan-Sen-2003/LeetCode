import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        //create a hashmap for connection
        //sort the heights array O(nlogn)
        //now take the height as key and put the name back in the array 

        HashMap <Integer,String> map =new HashMap<>();

        for(int i =0;i<heights.length;i++)
        map.put(heights[i],names[i]);

        Arrays.sort(heights);
        int n= heights.length;
        for (int i = 0; i < n / 2; ++i) {
            int temp = heights[i];
            heights[i] = heights[n - 1 - i];
            heights[n - 1 - i] = temp;
        }

        for(int i =0;i<heights.length;i++) {
            names[i]= map.get(heights[i]);
            map.remove(heights[i]);
        }
        return names;
    }
}