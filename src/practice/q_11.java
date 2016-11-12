package practice;

public class q_11 {

	public static void main(String[] args){
		
		int[][]  originalMatrix={{1 ,0, 0,1},
				                 {0 ,0, 1,0},
				                 {0 ,0, 0,0}};
		
		//int[] rows=new int[2];
		//int[] cols=new int[3];
		int rowFlag=0;
		int colsFlag=0;
		
		for(int i=0;i<3;i++){
			if(originalMatrix[i][0]==1){
				rowFlag=1;
				break;
			}
		}
		
		for(int i=0;i<4;i++){
			if(originalMatrix[0][i]==1){
				colsFlag=1;
				break;
			}
		}
		for(int i=1;i<3;i++){
			for(int j=1;j<4;j++){
				if(originalMatrix[i][j]==1){
					originalMatrix[i][0]=1;
					originalMatrix[0][j]=1;
				}
			}
		}
		
		for(int i=1;i<3;i++){
			for(int j=1;j<4;j++){
				if(originalMatrix[i][0]==1|| originalMatrix[0][j]==1){
					originalMatrix[i][j]=1;
				}
			}
		}
		
		if(rowFlag==1){
			for(int i=0;i<3;i++){
				originalMatrix[i][0]=1;
			}
		}
	//	System.out.println("rFlag   "+rowFlag+"  cFlag"+ colsFlag);
		if(colsFlag==1){
			for(int i=0;i<4;i++){
				originalMatrix[0][i]=1;
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print(originalMatrix[i][j]+"  ");
			}
			System.out.println("");
			
		}
	}
}
