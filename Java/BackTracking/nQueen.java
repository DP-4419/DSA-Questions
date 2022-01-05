public class nQueen {
	public static void main(String[] args) {
		int n=3;
		int board[][] = new int[8][8];

		if (solveNQueen(board, 0))
			printSolution(board);
		
		else
			System.out.println("Not Possible");
	}

	public static boolean solveNQueen(int board[][], int col) {
		if (col >= board.length)
			return true;

		for (int i = 0; i < board.length; i++)
			if (isSafe(board, i, col)) {
				board[i][col] = 1;

				if (solveNQueen(board, col + 1) == true)
					return true;

				board[i][col] = 0;
			}

		return false;
	}

	public static boolean isSafe(int board[][], int row, int col) {
		for (int i = 0; i < col; i++)
			if (board[row][i] == 1)
				return false;

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (board[i][j] == 1)
				return false;

		for (int i = row, j = col; j >= 0 && i < board.length; i++, j--)
			if (board[i][j] == 1)
				return false;

		return true;
	}

	public static void printSolution(int board[][]) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++)
				System.out.print(" " + board[i][j] + " ");
			System.out.println();
		}
	}
}