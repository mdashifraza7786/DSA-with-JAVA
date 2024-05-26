import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return result;
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;


        while(top <= bottom && left <= right){
            // Traverse top row
            for(int i = left; i <= right;i++){
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse right column
            for(int j = top; j <= bottom; j++){
                result.add(matrix[j][right]);
            }
            right--;

            // Check if we have traversed all rows and columns
            if(top <= bottom){
                // Traverse bottom row
                for(int i = right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                // Traverse left column
                for(int i = bottom; i >= top; i-- ){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }

        return result;
    }
}