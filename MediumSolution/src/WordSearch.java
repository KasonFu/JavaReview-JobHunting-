
public class WordSearch {
	static int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
    public static boolean exist(char[][] board, String word) {
        if(word.length()==0) return false;
        
        for(int i=0;i<board.length;i++)
        {
        	for(int j=0;j<board[i].length;j++)
        	{
        		boolean[][] marked= new boolean[board.length][board[0].length]; 
        		if(helper(board,word,0,i,j,marked))
        			return true;
        	}
        }
        return false;
    }
    public static boolean helper(char[][] board, String word, int index,int i, int j,boolean[][] marked)
    {
    	if(index==(word.length()-1)&&board[i][j]==word.charAt(index))
    		return true;
    	if(board[i][j]==word.charAt(index))
    	{
    		marked[i][j]=true;
    		for(int k=0;k<4;k++)
    		{
    				int newi = i+direction[k][0];
    				int newj = j+direction[k][1];
	    			if(inrange(board,newi,newj,marked)
	    					&&helper(board,word,index+1,newi,newj,marked))
	    				return true;
    		}
    		marked[i][j]=false;
    	}
    	return false;
    }
    public static boolean inrange(char[][] board, int i, int j, boolean[][] marked)
    {
    	if(i>=0&&j>=0&&i<board.length&&j<board[i].length&&marked[i][j]==false)
    		return true;
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'a','b','c','e'},{'s','f','e','s'},{'a','d','e','e'}};
		String s = "abceseeefs";
		System.out.print(exist(board,s));
	}

}
