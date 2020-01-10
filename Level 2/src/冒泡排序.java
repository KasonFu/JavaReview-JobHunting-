
public class ц╟ещеепР {
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++) 
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a= {2,4,6,8,3,5};
			sort(a);
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
	}

}
