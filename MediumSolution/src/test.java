import java.util.ArrayList;
import java.util.List;

public class test {
	public static boolean exist(char[][] board, String word) {
		if(word.length()==0) return true;
		boolean[][] marked = new boolean[board.length][board[0].length] ;
		int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
		return helper(board,word,0,0,0,marked,direction);
	 }
	 
	 public static boolean helper(char[][] board,String word, int index,int currx,int curry, boolean[][] marked,int[][] direction) {
		 if(index==word.length()-1&&board[currx][curry]==word.charAt(word.length()-1))
			return true;
		 if( word.charAt(index)==board[currx][curry]) {
			marked[currx][curry]=true;
			for(int i=0;i<4;i++) { 
				int x=direction[i][0]+currx;
				int y=direction[i][1]+curry;
				if(valid(board,x,y,marked)
						&&helper(board,word,index+1,x,y,marked,direction))
					return true;	
		 }
			marked[currx][curry]=false;
	}
		 return false;
}
	 
	 public static boolean valid(char[][] board,int currx,int curry, boolean[][] marked) {
		 if(currx>=0&&curry>=0&&currx<board.length&&
				 curry<board[currx].length&&!marked[currx][curry])
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

