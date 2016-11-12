package dp;

import java.util.Arrays;

public class findPath {
	
	
	public static void main(String[] args){
		
		int[][] m = {{7,2,12,15},
					 {1,6,10,14},
					 {3,4,5,0},
					 {9,11,8,13}};
		int[] lIndexArr = new int[16];
		int[] rIndexArr = new int[16];
		
		if(m[0][0]!=0 && m[0][0]!=1 && m[0][0]!=8 && findPathInMatrix(m, 0, 0, 2, 2,lIndexArr,rIndexArr,0)){
			System.out.println("there is a path between given point");
			for(int i=0;i<16;i++){
				if(lIndexArr[i]!=0 && rIndexArr[i]!=0){
					System.out.println(lIndexArr[i] +"   "+rIndexArr[i]+"  "+ m[lIndexArr[i]][rIndexArr[i]]+" "+i);
				}
			}
		}else{
			System.out.println("No path");
		}
		
	}
	
	
	public static boolean findPathInMatrix(int[][] m,int ci,int cj,int fi,int fj,int[] l,int[] r,int index){
		
		if(ci==fi && cj==fj){
			System.out.println("Path Exists");
			return true;
		}
		
		if(m[ci][cj]==-1){
			return false;
		}
		
		char[] arr=convertBinary(m[ci][cj]);
		int temp=m[ci][cj];
		m[ci][cj]=-1;
		l[index]=ci;
		r[index]=cj;
		
		if(arr[0]=='1' && ci-1>=0 && findPathInMatrix(m, ci-1, cj, fi, fj,l,r,index+1)){
			return true;
		}
		
		if(arr[1]=='1' && cj+1<4 && findPathInMatrix(m, ci, cj+1, fi, fj,l,r,index+1)){
			return true;
		}
		
		if(arr[2]=='1' && ci+1<4 && findPathInMatrix(m, ci+1, cj, fi, fj,l,r,index+1)){
			return true;
		}
		
		if(arr[3]=='1' && cj-1>=0 && findPathInMatrix(m, ci, cj-1, fi, fj,l,r,index+1)){
			return true;
		}
		
		m[ci][cj]=temp;
		return false;
	}
	
	public static char[] convertBinary(int value){
		char[] arr= new char[4];
		Arrays.fill(arr, ' ');
		int index=3;
		while(value!=0){
			if(value%2==0)
				arr[index--]='0';
			else
				arr[index--]='1';
			
			value/=2;
		}
		return arr;
	}

}
