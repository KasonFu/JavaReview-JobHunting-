import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char k: tasks) {
        	map.put(k, map.getOrDefault(k, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry:map.entrySet()) {
        	list.add(entry.getValue());
        }
        Integer[] a = list.toArray(new Integer[list.size()]);
        Arrays.sort(a);
        int max = a[a.length-1];
        int c=1;
        for(int i=a.length-2;i>=0;i--) {
        	if(a[i]==max)
        		c++;
        	else
        		break;
        }
        return Math.max(tasks.length, (max-1)*(n+1)+c);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
