package practice;

public class powerSet {
	
	public static void main(String[] args){
		
		String s="Kar";
		
		char[] sArr=s.toCharArray();
		int total=sArr.length;
		for(int i=1;i<=total;i++){
		printCombination(sArr, total, i);
		}
		/*for(int i=0;i<(1<<total);i++){
			//i & (1<<j) > 0
			for(int j=0;j<total;j++){
				if((i & (1<<j)) >0){
					System.out.print(sArr[j]);
				}
			}
			
			System.out.print(" , ");
		}*/
		
	}
	
	public static void printCombination(char[] arr,int size,int window){
		char[] temp=new char[size];

		combinationUntil(arr,temp,0,size-1,0,window);
		}

		public static void combinationUntil(char[] arr,char[] temp,int start,int end,int index,int w){

		if(index==w){
		    for(int i=0;i<w;i++){
		    	System.out.print(temp[i]);
		    }
		    System.out.println(" ");
		}

		for (int i=start; i<=end && end-i+1 >= w-index; i++)
		{
		    temp[index] = arr[i];
		    combinationUntil(arr, temp, i+1, end, index+1, w);
		}
		}
}
