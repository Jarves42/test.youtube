package practice;

public class rotateMatrix {
	
	public static void rotate(int N){
		
		
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				
				if(i%2==0)
					System.out.print(N-i);
			
				if(i%2==1)
					System.out.print("");
			}
		}
		
	}

}
