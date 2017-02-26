public class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                perimeter += getPerimeter(grid, i, j);
            }
        }
        return perimeter;
    }
    
    public int getPerimeter(int[][] grid, int i, int j){
        if(grid[i][j] == 0){
            return 0;
        }
        int perimeter = 0;
        //Check Left
        if(j-1 < 0 || (j-1 >=0 && grid[i][j-1] != 1)){
            perimeter++;
        }
        //Check Right
        if(j+1 >= grid[0].length || (j+1 < grid[0].length && grid[i][j+1] != 1)){
            perimeter++;
        }
        //Check Up
        if(i-1 < 0 || (i-1 >= 0 && grid[i-1][j] != 1)){
            perimeter++;
        }
        //Check Bottom
        if(i+1 >= grid.length || (i+1 < grid.length && grid[i+1][j] != 1)){
            perimeter++;
        }
        return perimeter;
    }
}
