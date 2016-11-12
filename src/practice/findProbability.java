package practice;

public class findProbability {
	
	public static boolean isSafe(int i,int j,int m,int n){
		
		return i>=0 && i<m && j>=0 && j<n;
	}
	
	public static double probOfPosition(int m,int n,int x,int y,int N){
		
		if(!isSafe(x,y,m,n)){
			return 0.0;
		}
		
		if(N==0)
			return 1.0;
		
		double prob=0.0;
		
		prob+=probOfPosition(m, n, x-1, y, N-1)*0.25;
		
		prob+=probOfPosition(m, n, x, y+1, N-1)*0.25;
		
		prob+=probOfPosition(m, n, x+1, y, N-1)*0.25;
		
		prob+=probOfPosition(m, n, x, y-1, N-1)*0.25;
		
		return prob;
	}
	
	public static void main(String[] args){
		
		int m=5;
		int n=5;
		
		int N=2;
		
		System.out.println(probOfPosition(m, n, 1, 1, N));
	}

}
