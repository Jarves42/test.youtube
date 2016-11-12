package practice;

public class maximumSnake {
	
	public static void findLength(int[][] sLength){
		
		findSnakeLength(sLength, 0, 0, sLength[0][0]+1);
	}
	
	public static void findSnakeLength(int[][] mat,int i,int j,int pre){
		
		if(mat[i][j]!=pre-1 && mat[i][j]!=pre+1){
			return;
		}
		
		if(i+1<4)
			findSnakeLength(mat,i+1,j,mat[i][j]);
		
		if(j+1<4)
			findSnakeLength(mat,i,j+1,mat[i][j]);
		
		System.out.println(mat[i][j]+"  ");
		
	} 
	public static void main(String[] args){
	
		int[][] sLength={{9, 6, 5, 2},
				{8, 7, 6, 5},
				{7, 3, 1, 6},
				{1, 1, 1, 7}};
		
		findLength(sLength);
	}

}
