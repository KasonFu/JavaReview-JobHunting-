import java.util.ArrayList;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<Integer>();
        ArrayList<Integer> columns = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[i].length;j++)
        	{
        		if(matrix[i][j]==0)
        		{
        			rows.add(i);
        			columns.add(j);
        		}
        	}
        }
        for(int k:rows)
        {
        	for(int i=0;i<matrix[k].length;i++)
        	{
        		matrix[k][i]=0;
        	}
        }
        for(int k:columns)
        {
        	for(int i=0;i<matrix.length;i++)
        	{
        		matrix[i][k]=0;
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
