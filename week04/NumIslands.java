/**
 * 岛屿数量
 */
public class NumIslands {
    int row;
    int column;

    /**
     * DFS
     *
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        int islandsCount = 0;
        row = grid.length;
        if (row == 0) {
            return 0;
        }
        column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    dfsMarking(i, j, grid);
                    islandsCount++;
                }
            }
        }
        return islandsCount;
    }

    private void dfsMarking(int i, int j, char[][] grid) {
        if (i < 0 || j < 0 || i >= row || j >= column || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0';
        dfsMarking(i - 1, j, grid);
        dfsMarking(i + 1, j, grid);
        dfsMarking(i, j - 1, grid);
        dfsMarking(i, j + 1, grid);
    }
}
