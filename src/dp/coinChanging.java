package dp;

public class coinChanging {
	
	public static void main(String[] args){
		
		int[] coins={1,2,3};
		int total=5;
		
		findTotalWay(coins, total);
	}
	
	public static void findTotalWayOfChange(int[] coins,int total){
		
		int[][] matrix=new int[coins.length+1][total+1];
		
		for(int i=0;i<=coins.length;i++){
			matrix[i][0]=1;
			
		}
		
		for(int i=1;i<=coins.length;i++){
			
			for(int j=1;j<=total;j++){
				
				if(j<coins[i-1]){
					matrix[i][j]=matrix[i-1][j];
				}else{
					matrix[i][j]=matrix[i-1][j]+matrix[i][j-coins[i-1]];
				}
			}
		}
		
		for(int i=1;i<=coins.length;i++){
			for(int j=1;j<=total;j++){
				System.out.print(matrix[i][j]);
			}
			
				System.out.println("");
		}
	}
	
	/* DP space efficient solution */
	
	public static void findTotalWay(int[]  coins,int total){
		
		int[] arr=new int[total+1];
		arr[0]=1;
		
		
		for(int i=0;i<coins.length;i++){
			
			for(int j=1;j<=total;j++){
				
				if(j>=coins[i]){
					arr[j]+=arr[j-coins[i]];
				}
			}
		}
		
		for(int j=0;j<=total;j++){
			
			System.out.println(arr[j]);
		}
		
	}//End of second solution

}
