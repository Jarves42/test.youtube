package practice;
import java.util.*;
public class cuttingRod {
	static int[][] dp;
	public static void main(String[] args){
		
		int[] l={1,2,3,4};
		int[] v={2,5,7,8};
		int tl=5;
		 dp=new int[4][tl+1];
		
		for(int i=0;i<4;i++){
			dp[i][0]=1;
		}
		
		findCutOfRod(v,l,tl,4,3);
		
		for(int i=0;i<4;i++){
			for(int j=0;j<tl+1;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static int findCutOfRod(int[] values,int[] length,int remainL,int totalCut,int curr){
		if(curr<=totalCut || remainL<=0)
			return 0;
		int profit;
		if(length[curr]<remainL){
			profit=Math.max(values[curr]+findCutOfRod(values, length, remainL-length[curr], totalCut, curr-1),
					findCutOfRod(values, length, remainL, totalCut, curr-1));
			dp[curr][remainL]=profit;
		}else{
			profit=findCutOfRod(values, length, remainL, totalCut, curr-1);
		}
		return dp[curr][remainL];
	}
}
