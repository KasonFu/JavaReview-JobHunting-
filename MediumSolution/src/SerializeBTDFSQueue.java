import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }


public class SerializeBTDFSQueue {
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if(root==null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.offer(root);
        
        while(!q.isEmpty()) {
        	TreeNode curr = q.poll();
        	if(curr == null)
        		sb.append("null");
        	else {
        		sb.append(curr.val);
        		q.offer(curr.left);
        		q.offer(curr.right);
        	}
        	sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
    	if(data.length()==0) return null;
       
    	String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        for(int i=1;i<arr.length;i++) {
        	TreeNode parent = q.poll();
        	if(!arr[i].equals("null")) {
	        	TreeNode left = new TreeNode(Integer.parseInt(arr[i]));
	        	parent.left=left;
	        	q.offer(left);
        	}
        	if(!arr[i+1].equals("null")) {
	        	TreeNode right = new TreeNode(Integer.parseInt(arr[i+1]));
	        	parent.right=right;
	        	q.offer(right);
        	}
        	i++;
        }
        return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
