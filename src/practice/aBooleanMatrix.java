package practice;
import java.util.ArrayList;
public class aBooleanMatrix {
	
	public static void makeBooleanMatrix(int[][] m){
		int row=m.length;
		int col=m[0].length;
		int rFlag=0;
		int cFlag=0;
		
		ArrayList<Integer> rList=new ArrayList<Integer>();
		
		ArrayList<Integer> cList=new ArrayList<Integer>();
		
	/*	for(int i=0;i<col;i++){
			if(m[0][i]==1){
				rFlag=1;
			}
		}
		
		for(int i=0;i<row;i++){
			if(m[i][0]==1){
				cFlag=1;
			}
		}
		*/
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				
				if(m[i][j]==1){
					//m[0][j]=1;
					//m[i][0]=1;
					if(!rList.contains(i)){
					rList.add(i);}
					
					if(!cList.contains(j)){
						cList.add(j);}
					
				}
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				
				if(rList.contains(i) || cList.contains(j)){
					m[i][j]=1;
					//m[i][0]=1;
				}
			}
		}
		
	/*	if(rFlag==1){
			for(int i=0;i<col;i++){
				m[0][i]=1;
			}
		}
		
		if(cFlag==1){
			for(int i=0;i<row;i++){
				m[i][0]=1;
			}
		}*/
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				
				System.out.print(m[i][j]+"  ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args){
		
		int[][] matrix={{0 ,0 ,0},
				{0, 0 ,1}};
		
		makeBooleanMatrix(matrix);
	}

}
