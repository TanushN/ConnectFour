package project;

public class ConnectFour {

	public int winner;
	private int count = 0;
	public int lowestindex;
	int[][] board;
	public int test = 5;
	
	public ConnectFour(){
	    
		board = new int[6][7];
		
	}
	public void addcoin(int col) {
		
		if(isFull(col) == false) {
			count++;
			
			int index = 0;
			int n = 0;
			if(count % 2 == 1) {
				n = 1;
			}
			else if(count % 2 == 0) {
				
			    n = 2;
			}
			else {
				n = 0;
			}
			for(int i = 0; i < board.length; i++) {
				if(board[i][col] == 0) {
					index = i;
				}
				
			}
			board[index][col] = n;
			lowestindex = index;
		}
		
		
	}
	
	public int getCount() {
		if(count % 2 == 0) {
			return 2;
		}
		else {
			return 1;
		}
	}
	public void display() {
		
		for(int r = 0; r < board.length; r++) {
			
			for(int c = 0; c < board[0].length; c++) {
				System.out.print(board[r][c]);
			}
			System.out.println("");
		}
		
		
		
	}
	public boolean isFull(int c) {
		for ( int r = 0; r < 6; r++) {

			if(board[r][c] == 0) {
				return false;
			}
		}
		return true;
	}
 
	
	
	
}
