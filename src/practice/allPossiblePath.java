package practice;

public class allPossiblePath {
	
	public static void main(String[] args){
		
		int[][] arr={{1,2,3,7},{4,5,6,8}};
		
		printAllPath(arr,2,4);
	}

	public static void printAllPath(int[][] arr,int r,int c){
		int[] path=new int[r+c];
		printAllPathUntil(arr,0,0,r,c,path,0);
	}
	
	public static void printAllPathUntil(int[][] arr,int i,int j,int r,int c,int[] path,int pi){
		
		if(i==r || j==c)
			return;
		/*if(i==r-1){
			
			for(int k=j;k<c;k++){
				path[pi+k-j]=arr[i][k];
			}
			
			for(int k=0;k<path.length;k++){
				System.out.print(path[k]+" ");
			}
			System.out.println("");
		}
		
		if(j==c-1){
			for(int k=i;k<r;k++){
				path[pi+k-i]=arr[k][i];
			}
			
			for(int k=0;k<path.length;k++){
				System.out.print(path[k]+" ");
			}
			System.out.println("");
		}*/
		path[pi++]=arr[i][j];
		
		printAllPathUntil(arr, i+1, j, r, c, path, pi);
		
		printAllPathUntil(arr, i, j+1, r, c, path, pi);
		
		if(path[pi]==arr[r-1][c-1]){
		for(int k=0;k<=pi;k++)
			System.out.print(path[k]+" ");
		
		System.out.println("");
		}
	}
}
