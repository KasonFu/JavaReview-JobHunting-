import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
    	if(intervals.length==0||intervals.length==1) return intervals;
    	Arrays.sort(intervals, mycomp);
    	List<int[]> list = new ArrayList<>();
    	int[] prev = intervals[0];
    	for(int i=1;i<intervals.length;i++) {
    		if(prev[1]>=intervals[i][0])	
    		{
    			prev[1] = Math.max(prev[1], intervals[i][1]);
    		}
    		else {
    			list.add(prev);
    			prev = intervals[i];
    		}
    	}
    	
    	list.add(prev);

    	return list.toArray(new int[list.size()][2]);
    }
    
    
    public static Comparator<int[]> mycomp = 
    		new Comparator<int[]>() {
    			public int compare(int[] a, int[] b)
    			{
    				return a[0]-b[0];
    			}
    };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,3},{2,6},{8,10},{13,15}};
		int[][] newa = merge(a);
		for(int i=0;i<newa.length;i++)
		{
			for(int j=0;j<newa[i].length;j++) {
				System.out.print(newa[i][j]);
			}
		}
	}

}
