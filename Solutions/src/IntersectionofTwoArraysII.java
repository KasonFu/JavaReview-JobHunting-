import java.util.ArrayList;

public class IntersectionofTwoArraysII {
	public static int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
			for(int k:nums1) {
				a1.add(k);
			}
				for(int h: nums2)
					{
						for(int i=0;i<a1.size();i++)
						{
							if(h==a1.get(i))
							{
								a2.add(h);
								a1.remove(i);
								break;
							}
						}
					}
		int[] newnums =new int[a2.size()]; 
		for(int i=0; i<a2.size();i++)
		{
			newnums[i]=a2.get(i);
		}
		return newnums;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,1,2};
		int b[] = {1,2};
		int c[] = intersect(a,b);
		for(int k:c) {System.out.println(k);}
	}

}
