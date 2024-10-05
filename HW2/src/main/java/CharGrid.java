// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}

	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int row = grid.length;
		int col = grid[0].length;
		int maxi = -1, maxj = -1;
		int mini = 100000, minj = 100000;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == ch) {
					mini = Math.min(mini, i);
					maxi = Math.max(maxi, i);
					minj = Math.min(minj, j);
					maxj = Math.max(maxj, j);
				}
			}
		}
		return (maxi - mini + 1)*(maxj - minj+ 1);
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int cnt = 0;
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		int f = dx.length;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				int d = 0;
				for(int k = 0; k < f; k++){
					int newi = i + dx[k];
					int newj = j + dy[k];
					if(newi >=0 && newi <= grid.length && newj >= 0 && newj <= grid.length && grid[newi][newj] == grid[i][j]){
						d++;
					}
				}
				if(d == 4){
					cnt++;
				}
			}
		}
		return cnt;
	}


}
