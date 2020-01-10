
public class SelectAllCombination {
	//µÝ¹é
	public static void selectallcombination(int[] arr, int start, int[] result, int count, int NUM, int arr_len)
	{
		   for (int i = start; i < arr_len + 1 - count; i++)
		   {
		     result[count - 1] = i;
		     if (count - 1 == 0)
		     {
		       for (int j = NUM - 1; j >= 0; j--)
		         System.out.printf("%d\t",arr[result[j]]);
		       System.out.print("\n");
		     }
		     else
		    	 selectallcombination(arr, i + 1, result, count - 1, NUM, arr_len);
	}
}
	
	//·ÇµÝ¹é
	public static void selectallcombination2(int[] arr, int num)
	{
		for(int i=0;i<arr.length-num+1;i++) {
			for(int j=i+1;j<arr.length-num+2;j++) {
				for(int k=j+1;k<arr.length-num+3;k++) {
					for(int m=k+1;m<arr.length-num+4;m++) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[m]);
					}
				}
			}
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,2,5,6};
		int[] b = new int[3];
		selectallcombination(a,0,b,3,3,5);
	}

}
