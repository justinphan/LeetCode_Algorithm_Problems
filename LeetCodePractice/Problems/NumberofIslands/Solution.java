package NumberofIslands;
class Solution {
    public int numIslands(char[][] grid) {
    	int num = 0;
    	for (int i = 0; i <grid[0].length;i++) {
    		for(int j = 0; j<grid.length; j++) {
    			if (grid[i][j]==1) {
    				
    				num++;
    				bfs(grid,i,j);
    			}
    		}
    	}
    	return num;
    }
    
    public void bfs(char[][] grid, int r, int c){
    	grid[r][c]=0;
        if (c-1>=0 && grid[r][c-1]==1) bfs(grid, r, c-1);
        if (c+1<grid[0].length && grid[r][c+1]==1) bfs(grid, r, c+1);
        if (r-1>=0 && grid[r-1][c]==1) bfs(grid,r-1,c);
        if (r+1<grid.length && grid[r+1][c]==1) bfs(grid, r+1,c);

    }
}