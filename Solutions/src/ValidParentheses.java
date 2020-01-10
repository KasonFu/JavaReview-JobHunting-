import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidParentheses {
	public static boolean isValid(String s) {
        if(s.length()==1) return false;
        if(s.length()==0) return true;
        HashMap<Character, Character> h = new HashMap<Character, Character>();
        h.put('{', '}');
        h.put('[', ']');
        h.put('(', ')');
        List<Character> charlist = new ArrayList<Character>();
        for(int i=0;i<s.length();i++) {
        	if(h.containsKey(s.charAt(i))) {
        		charlist.add(s.charAt(i));
        	}
        	else {
	        		if(charlist.size()==0)
	        			return false;
	        		else {
	        			char prev = charlist.get(charlist.size()-1);
	        			if(h.get(prev)==s.charAt(i)) {
	        				charlist.remove(charlist.size()-1);
	        			}else
	        				return false;
        		}
        	}
        }
        if(charlist.size()==0)
        	return true;
        else
        	return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "{[]}";
		System.out.println(isValid(a));
	}

}
