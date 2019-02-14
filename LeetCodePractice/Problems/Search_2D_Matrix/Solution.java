package Search_2D_Matrix;

public class Solution {
	
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 ) return false;
    	return (searchMatrix(matrix, 0, 0, matrix.length-1, matrix[0].length-1, target)) ;
    }
    
    public static boolean searchMatrix(int[][] matrix, int i1, int j1, int i2, int j2, int target) {
    	
    	if (i1<=i2 && j1 <=j2) {	
    		int imid = (i1+i2)/2;
    		int jmid = (j1+j2)/2;
	    	if (matrix[imid][jmid] == target) {
	    		return true;
	    	}
	    	else if (matrix[imid][jmid]> target) {
	    		if (imid-1>=0 ) {
	    			if (searchMatrix(matrix, i1, j1,imid-1, j2,target))
		    			return true;
	    		}
	    		if (jmid-1>=0) {
	    			if (searchMatrix(matrix, imid, j1,i2, jmid-1,target))
	    				return true;
	    		}
	    	}
	    	else {
	    		if (jmid+1< matrix[0].length) {
	    			if (searchMatrix(matrix, i1, jmid+1,i2, j2, target))
		    			return true;
	    		}
	    		if (imid+1< matrix.length) {
	    			if (searchMatrix(matrix, imid+1, j1,i2, jmid, target))
		    			return true;
	    		}
	    	}
    	}
    	return false;
    }

    public static boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix.length==0) return false;

        int row = matrix.length-1;
        int column = matrix[0].length-1;

        int i = 0;
        int j =  column;
        while (i <= row && j >=0 ) {
            if (matrix[i][j] ==target) {
                return true;
            }
            else if (matrix[i][j]< target){
                i++;
            }
            else j--;
        }
        return false;
    }
    
    public static boolean searchMatrix3(int[][] matrix, int target) {
        if (matrix.length==0) return false;

        int row = matrix.length;
        int column = matrix[0].length;
        
        int i = 0;
        int j = 0;
        
        
        return false;

    }
    
	public static void main(String[] args) {
		int[][] arr =
			{
		  {1,   4,  7, 11, 15},
		  {2,   5,  8, 12, 19},
		  {3,   6,  9, 16, 22},
		  {10, 13, 14, 17, 24},
		  {18, 21, 23, 26, 30}		
			};
		System.out.println(searchMatrix2(arr, 20));
	}
}
