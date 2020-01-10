
import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
       ArrayList<Integer> a = new ArrayList<Integer>();
       for(int i=0; i<m;i++) {
    	   a.add(nums1[i]);
       }
       for(int i=0; i<n;i++) {
    	   a.add(nums2[i]);
       }
       int[] nums = new int[m+n];
       for(int i=0; i<m+n;i++) {
    	   nums[i]=a.get(i);
       }
       Arrays.sort(nums);
       
       for(int i=0; i<m+n;i++) {
    	   nums1[i]=nums[i];
       }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,0,0,3,3,3,0,0,0};
		int[] b = {1,2,2};
		merge(a,6, b,3);
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);}
	}

}
