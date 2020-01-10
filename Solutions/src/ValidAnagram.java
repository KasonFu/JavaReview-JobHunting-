import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
    	for(int i=0;i<s.length();i++) {
    		if(!map.containsKey(s.charAt(i))){
    			map.put(s.charAt(i), 1);
    		}else {
    			int k=map.get(s.charAt(i));
    			map.put(s.charAt(i), k+1);
    		}
    	}
    	for(int i=0;i<t.length();i++) {
    		if(!map2.containsKey(t.charAt(i))){
    			map2.put(t.charAt(i), 1);
    		}else {
    			int k=map2.get(t.charAt(i));
    			map2.put(t.charAt(i), k+1);
    		}
    	}
    	if(map.equals(map2))
		return true;
    	else
    		return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("rat","car"));
	}

}
