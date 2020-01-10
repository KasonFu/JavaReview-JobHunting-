
public class 表达式求值 {
	//例如表达式45+9*的意思为(4+5)*9
	//利用栈来制造二叉树
	public static TreeNode parse(char[] a)
	{
		stack s = new stack();
		for(char k: a)
		{
			if(k>='0'&&k<='9')
			{
				s.push(new TreeNode(k));
			}
			else
			{
				TreeNode temp = new TreeNode(k);
				temp.right = s.pop();
				temp.left = s.pop();
				s.push(temp);
			}
		}
		if(s.size()!=1) {
		System.out.println("Illegal expression");
		return null;}
		else return s.pop();
	}
	
	public static void postprint(TreeNode a)
	{
		if(a==null) return;
		postprint(a.left);
		postprint(a.right);
		System.out.print(a.c);
	}
	
	public static int calculate(TreeNode root)
	{
		if(root ==null)return Integer.MAX_VALUE;
		if(root.c>='0'&&root.c<='9')
			return (int)root.c-'0';
		switch(root.c) {
		case '*':
			return calculate(root.left)*calculate(root.right);
		case '+':
			return calculate(root.left)+calculate(root.right);
		case '-':
			return calculate(root.left)-calculate(root.right);
		}
		return Integer.MIN_VALUE;
	}
	
	
	public static int directcalculate(char[] a)
	{
		stack s = new stack();
		for(char k: a)
		{
			if(k>='0'&&k<='9')
			{
				int n = k-'0';
				s.push(new TreeNode(n));
			}
			else
			{
				if(s.size()<2)
				{
					System.out.println("Illegal expression");
					return Integer.MAX_VALUE;
				}
				int left,right;
				char temp;
				switch(k) {
					case '*':
						right = (int)s.pop().val;
						left = (int)s.pop().val;
						s.push(new TreeNode(right*left));
						break;
					case '+':
						right = (int)s.pop().val;
						left = (int)s.pop().val;
						s.push(new TreeNode(right+left));
						break;
					case '-':
						right = (int)s.pop().val;
						left = (int)s.pop().val;
						s.push(new TreeNode(left-right));
						break;
				}
			}
		}
		return s.pop().val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = {'4','5','+','9','*'};
		char[] b = {'7','5','2','-','*'};
		char[] c = {'7'};
		TreeNode t = parse(a);
		TreeNode f = parse(b);
		TreeNode k = parse(c);
//		postprint(t);
//		System.out.println();
//		postprint(f);
//		System.out.println();
//		postprint(k);
//		System.out.println();
//		System.out.println(calculate(t));
//		System.out.println(calculate(f));
//		System.out.println(calculate(k));
		System.out.println(directcalculate(a));
		System.out.println(directcalculate(b));
		System.out.println(directcalculate(c));
 	}

}
