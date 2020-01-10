
public class StringtoInteger {
	 public static int myAtoi(String str) {
		 str = str.trim();
		 long sign=1;
		 long res=0;
		 int start = 0;
		 if(str.length()==0)
			 return 0;
		 if(!Character.isDigit(str.charAt(0)))
		 {
			 if(str.charAt(0)=='-') 
			 {
				 sign=-1;
				 start = 1;
			 }
			 else if(str.charAt(0)=='+') 
			 {
				 sign=1;
				 start = 1;
			 }
			 else 
			 return 0;
		}

		
		 for(;start<str.length();start++) {
			 if(str.charAt(start)>'9'||str.charAt(start)<'0')
				 break;
			 else {
				 res = res*10+str.charAt(start)-'0';
				 if(res*sign>Integer.MAX_VALUE)return Integer.MAX_VALUE;
				 if(res*sign<Integer.MIN_VALUE)return Integer.MIN_VALUE;
			 }
		}
		 return (int)(res*sign);
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'-');
		System.out.println((int)'0');
		System.out.println((int)'9');
		System.out.println((int)'A');
		System.out.println(Integer.MIN_VALUE);
		System.out.println(myAtoi(""));
	}

}
