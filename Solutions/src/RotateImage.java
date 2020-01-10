
public class RotateImage {
    public void rotate(int[][] matrix) {
   
        for(int row=0; row<matrix.length; row++) {
        	for(int col=0;col<matrix[row].length; col++) {
        		if(row<col)
        		{
	        		int k = matrix[row][col];
	        		matrix[row][col] = matrix[col][row];
	        		matrix[col][row] = k;
        		}
        	}
        }
        
        for(int row=0; row<matrix.length; row++) {
        	for(int col=0;col<matrix[row].length/2; col++) {
        		int k = matrix[row][col];
        		matrix[row][col] = matrix[row][matrix[row].length-col-1];
        		matrix[row][matrix[row].length-col-1]=k;
        	}
        }
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
