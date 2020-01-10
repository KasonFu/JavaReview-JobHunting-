import java.util.HashSet;
import java.util.Random;

public class RandomizedSet {
	 	HashSet<Integer> h;
	    /** Initialize your data structure here. */
	    public RandomizedSet() {
	 		h = new HashSet();
	    }
	    
	    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
	    public boolean insert(int val) {
	        if(!h.contains(val))
	        {
	        	h.add(val);
	        	return true;
	        }
	        else
	        	return false;
	    }
	    
	    /** Removes a value from the set. Returns true if the set contained the specified element. */
	    public boolean remove(int val) {
	        if(h.contains(val)) {
	        	h.remove(val);
	        	return true;
	        }
	        else
	        	 return false;
	    }
	    
	    /** Get a random element from the set. */
	    public int getRandom() {
	    	int i = (int) (Math.random()*h.size());
	        return (int) h.toArray()[i];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
