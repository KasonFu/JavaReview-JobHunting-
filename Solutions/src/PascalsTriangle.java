import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
	    List<List<Integer>> res = new ArrayList<List<Integer>>(); 
	    if(numRows==0) return res;
	    List<Integer> firstRow = new ArrayList<>();
	    firstRow.add(1);
	    res.add(firstRow);
	    
	    for(int i=1;i<numRows;i++) {
	    	List<Integer> prev_row = res.get(i-1);
	    	List<Integer> row = new ArrayList<Integer>();
	    	row.add(1);
	    	for(int j=1;j<i;j++) {
	    		row.add(prev_row.get(j-1) + prev_row.get(j));
	    	}
	    	row.add(1);
	    	res.add(row);
	    }
	    return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
