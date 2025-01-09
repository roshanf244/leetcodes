class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        while(i<n){
            if(target<=matrix[i][m-1] && target>=matrix[i][0]){
                for(int a=0;a<m;a++){
                    if(target==matrix[i][a]){
                        return true;
                    }
                }
                return false;
            }
            i++;
        }
        return false;
    }
}