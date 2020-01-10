import java.util.HashMap;

public class RomantoInteger {
    public static int romanToInt(String s) {
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		h.put('I', 1);
		h.put('V', 5);
		h.put('X', 10);
		h.put('L', 50);
		h.put('C', 100);
		h.put('D', 500);
		h.put('M', 1000);
		int amount=0;
		for(int i=1;i<s.length();i++) {
			if(h.get(s.charAt(i-1))<h.get(s.charAt(i)))
			amount -= h.get(s.charAt(i-1));
			else
			amount += h.get(s.charAt(i-1));
		}
    	return amount+h.get(s.charAt(s.length()-1));
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("MCMXCIV"));
	}

}
