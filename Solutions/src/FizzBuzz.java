import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
		ArrayList<String> a = new ArrayList<String>();
    	for(int i=1;i<=n;i++) {
    		if(i%3==0) {
    			if(i%5==0)
    				a.add("FizzBuzz");
    			else
    				a.add("Fizz");
    		}else if(i%5==0) {
    			a.add("Buzz");
    		}else
    			a.add(Integer.toString(i));
    	}
		return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<fizzBuzz(15).size();i++) {
		System.out.println(fizzBuzz(15).get(i));}
	}

}
