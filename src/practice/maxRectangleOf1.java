package practice;
import java.util.Stack;
public class maxRectangleOf1 {
	
	public static void main(String[] args){
		
		int[][] matrix={{1,0,0,0,1,1},
						{1,0,1,1,1,1},
						{0,1,1,1,1,1},
						{0,0,1,1,1,0}};
		
		findMaxSizeRactangle(matrix);
	}
	
	public static void findMaxSizeRactangle(int[][] mat){
		int size=0;
		int maxSize=-1000;
		int[] arr=new int[mat[0].length];
		for(int t=0;t<arr.length;t++){
			arr[t]=0;
		}
		
		
		for(int i=0;i<mat.length;i++){
			
			for(int j=0;j<mat[i].length;j++){
				if(mat[i][j]==1){
					arr[j]++;
				}else{
					arr[j]=0;
				}
			}
			
			Stack<Integer> s=new Stack<Integer>();
			int k=0;
			for(;k<arr.length;){
					if(s.isEmpty() || arr[s.peek()]<=arr[k]){
							s.push(k++);
					}else{
							int top=s.pop();
							
							if(s.isEmpty()){
								size=arr[top]*k;
							}else{
								size=arr[top]*(k-s.peek()-1);
							}
							
							if(size>maxSize){
								maxSize=size;
							}
					}
			}
				
					while(!s.isEmpty()){
							int top=s.pop();
							
							if(s.isEmpty()){
								size=arr[top]*k;
							}else{
								size=arr[top]*(k-s.peek()-1);
							}
							
							if(size>maxSize){
								maxSize=size;
							}
					}
					System.out.println("inside   " +maxSize);
		}
		
		System.out.println(maxSize);
		
	}

}
