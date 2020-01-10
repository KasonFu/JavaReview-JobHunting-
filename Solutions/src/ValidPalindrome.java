
public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
		if(s.length()==0)return true;
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
				continue;
			}
			if(!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
				continue;
			}
			int a = (int)s.charAt(i);
			int b = (int)s.charAt(j);
			if(Character.isLowerCase(s.charAt(i)))
				a = a-32;
			if(Character.isLowerCase(s.charAt(j)))
				b = b-32;
			if(a!=b)
				return false;
			else {
				i++;
				j--;
			}
		}
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println((int)'a');
		System.out.println((int)'A');
		System.out.println(isPalindrome(s));
	}

}
