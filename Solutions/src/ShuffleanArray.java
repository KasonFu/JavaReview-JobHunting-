import java.util.ArrayList;
import java.util.List;

public class ShuffleanArray {
    private int[] arrays;
    private int[] copy;

    public ShuffleanArray(int[] nums) {
        this.arrays = nums;
        this.copy = arrays.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        for(int i=0;i<copy.length;i++) {
        	arrays[i]=copy[i];
        }
        return arrays;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	List<Integer> a = new ArrayList<Integer>();
    	for(int i=0;i<arrays.length;i++) {
    		a.add(arrays[i]);
    	}
    	for(int i=0;i<arrays.length;i++){
    		int number = (int)(Math.random()*(arrays.length-i));
    		arrays[i]=a.get(number);
    		a.remove(number);
    	}
    	return arrays;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		ShuffleanArray s = new ShuffleanArray(a);
		s.shuffle();
		s.reset();
		for(int k:s.arrays) {
			System.out.println(k);
		}
	}

}
