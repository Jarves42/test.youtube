package dp;

public class SubRectanglularMatrixWithMaxSum {
	
	class result{
		
		int maxSum;
		int leftBound;
		int rightBound;
		int upperBound;
		int lowerBound;
		
		public String toString(){
			return "Result [maxSum=" + maxSum + ", leftBound=" + leftBound
                    + ", rightBound=" + rightBound + ", upBound=" + upperBound
                    + ", lowBound=" + lowerBound + "]";
		}
	}
	
	public result findMatrixMaxSum(int[][] m){
		int rows=m.length;
		int cols=m[0].length;
		
		result rObj=new result();
		int[] arr=new int[rows];
		for(int l=0;l<cols;l++){
			
			for(int i=0;i<rows;i++){
				arr[i]=0;
			}
			
			for(int r=l;r<cols;r++){
				
				for(int i=0;i<rows;i++){
					arr[i]+=m[i][r];
				}
				
				KadaneResult kObj=kadane(arr);
				
				if(kObj.maxSum>rObj.maxSum){
					rObj.maxSum=kObj.maxSum;
					rObj.leftBound=l;
					rObj.rightBound=r;
					rObj.lowerBound=kObj.Start;
					rObj.upperBound=kObj.End;
				}
			}
		}
		return rObj;
	}
	
	class KadaneResult{
		
		int maxSum;
		int Start;
		int End;
		
		public KadaneResult(int maxSum,int maxStart,int maxEnd){
			this.maxSum=maxSum;
			this.Start=maxStart;
			this.End=maxEnd;
		}
	}
		
		public KadaneResult kadane(int[] arr){
			
			int max=0;
			int maxSoFar=0;
			int maxStart=-1;
			int maxEnd=-1;
			int currStart=0;
			
			for(int i=0;i<arr.length;i++){
				maxSoFar+=arr[i];
				
				if(maxSoFar<0){
					maxSoFar=0;
					currStart=i+1;
				}
				if(maxSoFar>max){
					maxStart=currStart;
					maxEnd=i;
					max=maxSoFar;
				}
			}
			
			return new KadaneResult(max,maxStart,maxEnd);
		}
		
		public static void main(String args[]){
	        int input[][] = {{ 2,  1, -3, -4,  5},
	                         { 0,  6,  3,  4,  1},
	                         { 2, -2, -1,  4, -5},
	                         {-3,  3,  1,  0,  3}};
	        SubRectanglularMatrixWithMaxSum saw = new SubRectanglularMatrixWithMaxSum();
	        System.out.println(saw.findMatrixMaxSum(input));
	    } 
	

}
