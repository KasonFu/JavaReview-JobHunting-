
public class TwoSumThreeSum {

	public static void twosum(int[] a,int b)
	{
		int start=0;
		int end=a.length-1;
		while(start<end)
		{
			if((a[start]+a[end])<b) {
				start++;
			}else if(a[start]+a[end]>b) {
				end--;
			}else {
				System.out.println(a[start]+" "+a[end]);
				start++;end--;
			}
		}
	}
	
	public static void threesum(int[] a,int b)
	{
		for(int i=0;i<a.length-3;i++)
		{
			System.out.println(i);
			twosum(subarray(a,i),b-a[i]);
		}
	}
	
	public static int[] subarray(int[] a,int index)
	{
		int[] b=new int[a.length-index-1];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i+index+1];
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,1,2,3,4,5,6,7,8,9};
		//twosum(a,12);
		threesum(a,12);
	}

}
