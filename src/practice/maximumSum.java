package practice;

public class maximumSum {
	
	public static void findSubSum(int[][] m,int n,int k){
		int[][] newM=new int[n][n];
		for(int i=0;i<=n-k;i++){
			
			for(int j=0;j<n;j++){
				
				newM[i][j]=m[i][j]+m[i+1][j]+m[i+2][j];
			}
		}
		
/*for(int i=0;i<=n-k;i++){
			
			for(int j=0;j<n;j++){
				
				System.out.println(newM);
			}
		}
*/

		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<=n-k;i++){
			int sum=0;
			for(int j=0;j<=n-k;j++){
				sum=newM[i][j]+newM[i][j+1]+newM[i][j+2];
				
				if(sum>max)
					max=sum;
			}
			
			
		}
		
		System.out.println(max);
	}
	public static void main(String[] args){
		
		int[][] mat={{1, 1, 1, 1, 1},
	        {2, 2, 2, 2, 2},
	        {3, 8, 6, 7, 3},
	        {4, 4, 4, 4, 4},
	        {5, 5, 5, 5, 5}};
		
		findSubSum(mat, 5,3);
	}

}
