package palindrome;

public class palindromeMerge {
	
	int[] arr;
	
	public palindromeMerge(int[] array){
		this.arr= array;
	}
	
	/*public int minMerge(){
		int l = arr.length;
		if(){
			return 0;
		}
		
		
	}*/
	
	public boolean isPalindrome(int[] arr){
		boolean t=true;
		for(int i=0;i< arr.length/2 ; i++){
			if(arr[i] == arr[(arr.length-1) -i]){
				continue;
			}
			else{
				t=false;
				break;
			}
		}
		return t;
	}
}
