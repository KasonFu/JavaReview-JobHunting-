import java.util.ArrayList;
import java.util.List;

public class MinStack {
    /** initialize your data structure here. */
	private List<Integer> stack = new ArrayList<Integer>();
    public MinStack() {
        
    }
    
    public void push(int x) {
    	stack.add(0, x);
    }
    
    public void pop() {
    	if(stack.size()!=0)
        stack.remove(0);
    }
    
    public int top() {
    	if(stack.size()==0)return -1;
    	return stack.get(0);
    }
    
    public int getMin() {
    	if(stack.size()==0)return -1;
        int min=stack.get(0);
        for(int i=1;i<stack.size();i++)
        {
        	if(stack.get(i)<min)
        		min=stack.get(i);
        }
        return min;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack a = new MinStack();
		a.push(-2);
		a.push(0);
		a.push(-3);
		System.out.println(a.getMin());
		a.pop();
		System.out.println(a.top());
		System.out.println(a.getMin());
	}

}
