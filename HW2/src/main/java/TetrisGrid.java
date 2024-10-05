//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	private boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int row = grid.length;
		int col = grid[0].length;
		for (int r = 0; r < row; r++) {
			int cnt = 0;
			for (int c = 0; c < col; c++) {
				if(grid[r][c]) {
                     cnt++;
				}
                if(cnt == col) {
					for (int m = r; m >= 1; m--) {
						grid[m] = grid[m - 1];
					}
					grid[0] = new boolean[col];

				}
			}
		}
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return this.grid;
	}



}
