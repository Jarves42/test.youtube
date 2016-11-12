package practice;

public class findNegativeNumber {
	
	public static void findTotalNegative(int[][] matrix){
		int total=0;
		int innerStart=matrix[0].length-1;
		for(int i=0;i<matrix.length;i++){
			for(int j=innerStart;j>=0;j--){
				if(matrix[i][j]<0){
					total +=j+1;
					innerStart=j;
					break;
				}
			}
		}
		System.out.println(total);
		
	}
	
	public static void main(String[] args){
			
		int[][] matrix={{-3, -2, -1,  1},
						{-2,  -1,  3,  4},
						{4,   5,  7,  8}};
		
		findTotalNegative(matrix);
		
	//	 unordered_map<int, vector<int> > map;
	}

}
