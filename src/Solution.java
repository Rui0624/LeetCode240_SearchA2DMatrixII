
public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
        	return false;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int x = m - 1;
        int y = 0;
        
        while(true){
        	if(matrix[x][y] < target){
        		y++;
        	}else if(matrix[x][y] > target){
        		x--;
        	}else
        		return true;
        	
        	if(x < 0 || y >= n)
        		break;
        }
        
        return false;
    }
}
