
public class ReverseString {

	//µü´ú Better
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++) {
        	char k = s[i];
        	s[i] = s[s.length-i-1];
        	s[s.length-i-1] = k;
        }
    }
    
    //µÝ¹é
    public static void reverseString2(char[] s) {
    	reverse(s,0,s.length-1);
    }
    public static void reverse(char[] s, int low,int high)
    {
        if(low<high){
            char k= s[low];
            s[low]=s[high];
            s[high]=k;
            reverse(s,low+1,high-1);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s= {'h','e','l','l','o'};
		reverseString2(s);
		for(char k:s)
		{
			System.out.print(k);
		}
	}

}
