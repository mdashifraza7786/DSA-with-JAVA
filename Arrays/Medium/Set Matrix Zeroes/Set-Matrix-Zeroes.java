class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zerorows = new boolean[rows];
        boolean[] zerocolumns = new boolean[cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j< cols; j++){
                if(matrix[i][j] == 0){
                    zerorows[i] = true;
                    zerocolumns[j] = true;
                
                }
            }
        }

        for(int i =0; i < rows; i++){
            for(int j = 0 ;j<cols; j++){
                if(zerorows[i] || zerocolumns[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}