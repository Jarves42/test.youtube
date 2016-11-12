package dp;

public class mobileNumericKeypadProblem {
	public static void main(String[] args){
		
		int[][] keypad={{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
		
		int count=findCount(keypad, 4);
		
		System.out.println(count);
		
	}
	/* Using Matrix of 10 by length.*/
	public static int findCount(int[][] k,int n){
		
		int[][] cMatrix=new int[10][n+1];
		int totalCount=0;
		int ro;
		int co;
		for(int i=0;i<10;i++){
			cMatrix[i][0]=0;
			cMatrix[i][1]=1;
		}
		int[][] position={{0,-1,0,1,0},{0,0,-1,0,1}};
			
		for(int l=2;l<=n;l++){	
				for(int i=0;i<4;i++){
					for(int j=0;j<3;j++){
						
						if(k[i][j]>=0){
						int num=k[i][j];
						cMatrix[num][l]=0;
						for(int move=0;move<=4;move++){
							ro=i+position[0][move];
							co=j+position[1][move];
							
								if(ro>=0 && ro<4 && co>=0 && co<3 && k[ro][co]>=0){
									int nextNum=k[ro][co];
									cMatrix[num][l]+=cMatrix[nextNum][l-1];
								}
							}
						}
					}
				}
		}
		
		for(int i=0;i<10;i++){
			totalCount+=cMatrix[i][n];
		}
		return totalCount;
		
	}
	
	/*Using two Hash Map of size 10 by 1. calculate new hashmap using old one and then copy it into old. 
	 * By this we can make this better than previous one  */
	
	
}
