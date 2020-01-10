import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class PopulatingNextRightPointers {
    public static Node connect(Node root) {
        if(root==null)return root;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
        	List<Node> list = new ArrayList<>();
        	int size = q.size();
        	for(int i=0;i<size;i++) {
        		Node curr = q.poll();
        		list.add(curr);
        		if(curr.left!=null)
        		{
        			q.offer(curr.left);
        			q.offer(curr.right);
        		}
        	}
        	if(list!=null) {
	        	for(int i=0;i<list.size()-1;i++) {
	        		list.get(i).next=list.get(i+1);
	        	}
	        	list.get(list.size()-1).next=null;
        	}
        }
      return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Node a = new Node(1);
			Node b = new Node(2);
			Node c = new Node(3);
			Node d = new Node(4);
			Node e = new Node(5);
			Node f = new Node(6);
			Node g = new Node(7);
			a.left=b;
			a.right=c;
			b.left=d;
			b.right=e;
			c.left=f;
			c.right=g;
			connect(a);
	}

}
