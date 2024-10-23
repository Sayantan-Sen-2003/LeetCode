class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> mylist = new ArrayList<>();

        int top=0;
        int bottom= matrix.length-1;
        int left=0;
        int right= matrix[0].length-1;

        // right-->bottom-->left-->up
        while(left<=right && top<=bottom){
        for(int i=left;i<=right;i++)
        mylist.add(matrix[top][i]);
        top++;

        for(int i=top;i<=bottom;i++)
        mylist.add(matrix[i][right]);
        right--;
        
        if(left<=right && top<=bottom){
        for(int i=right;i>=left;i--)
        mylist.add(matrix[bottom][i]);
        bottom--;
        }
        
        if(left<=right && top<=bottom){
        for(int i= bottom;i>=top;i--)
        mylist.add(matrix[i][left]);
        left++;
        }
        }

        return mylist;

    }
}
