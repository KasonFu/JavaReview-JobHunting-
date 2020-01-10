
public class Searcha2DMatrixII {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix==null||matrix.length==0||matrix[0].length==0)
			return false;
		int row=0; int col=matrix[0].length-1;
		while(row>=0&&col>=0&&row<matrix.length&&col<matrix[row].length) {
			if(matrix[row][col]==target)
				return true;
			if(matrix[row][col]>target)
				col--;
			else
				row++;
		}	
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
