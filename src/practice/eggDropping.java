package practice;

public class eggDropping {
	
	public static void main(String[] args){
		int egg=2;
		int floor=6;
		
		int[][] matrix=new int[egg+1][floor+1];
		
		for(int i=0;i<egg+1;i++){
			matrix[i][0]=0;
		}
		for(int i=0;i<floor+1;i++){
			matrix[0][i]=0;
		}
		matrix[1][1]=1;
		
		for(int i=1;i<egg+1;i++){
			for(int j=1;j<floor+1;j++){
				if(i>j){
					matrix[i][j]=matrix[i-1][j];
				}else{
					int min=Integer.MAX_VALUE;
					
					for(int k=0;k<=j;k++){
						int max=Math.max(matrix[i-1][k-1], matrix[i][j-k]);
						if(min<max){
							min=max;
						}
					}
					matrix[i][j]=min+1;
				}
			}
		}
		
		for(int i=0;i<egg;i++){
			for(int j=0;j<floor;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}
	}
}
