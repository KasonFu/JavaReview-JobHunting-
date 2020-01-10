import java.util.Arrays;

public class USAVoting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tickets = {12,7,6,55,3,4,11,6,4,3,3,9,5,38,7,6,5,3,3,10,6,10,6,8,6,9,11,8,11,20,10,16,18,5,13,15,9,16,29,20,29,1,3,3,4,11,4,7,14,3,10,3};
		int n = tickets.length;
		Arrays.sort(tickets);
		int s[] = new int[n];
		s[0]=12;
		for(int i=1;i<n;i++) {
			s[i]=s[i-1]+tickets[i];
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(s[j]-s[i]==269)
					System.out.println(i+": "+ tickets[i] + ", " + j + ": "+ tickets[j]);
			}
		}
	}

}
