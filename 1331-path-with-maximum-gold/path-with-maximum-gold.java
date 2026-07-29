class Solution {
    int max=0;
    public int getMaximumGold(int[][] grid) {
       for(int i =0;i<grid.length;i++){
        for(int j =0;j<grid[0].length;j++){
            if(grid[i][j]!=0){
                maxgold(grid,i,j,0);
            }
        }
       }
       return max; 
    }
    public void maxgold(int[][] grid, int row , int col,int sum){
        if(row<0||col<0||row==grid.length||col==grid[0].length||grid[row][col]==0) return;
        
        
        int n =grid[row][col];
        max=Math.max(sum+n,max);
        grid[row][col]=0;

        maxgold(grid,row-1,col,sum+n);
        maxgold(grid,row+1,col,sum+n);
        maxgold(grid,row,col-1,sum+n);
        maxgold(grid,row,col+1,sum+n);

        grid[row][col]=n;

    }
}