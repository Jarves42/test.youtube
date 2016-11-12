package MinDifference;
import java.util.Arrays;
import java.lang.Math;
public class minDiff {
	int[] arr;
	int k;
	public minDiff(int[] Arr , int k){
		this.arr = Arr;
		this.k=k;
	}
	
	public int minDifference(){
		int l=arr.length;
		if(arr.length<2){
			return 0;
		}
		
		Arrays.sort(arr);
		
		int min= arr[0];
		int max=arr[l-1];
		
		
		if(k>= max-min){
			return max-min;
		}
		
		arr[0] = arr[0] + k;
		arr[l-1]=arr[l-1] -k;
		
		
		int new_min = Math.min(arr[0], arr[l-1]);
		int new_max = Math.max(arr[0],arr[l-1]);
		
		for(int i=1;i<l-1;i++){
			if(arr[i] < new_min){
				arr[i] +=k;
			}
			else if(arr[i]>new_max){
				arr[i] -=k;
			}
			else if((arr[i] - new_min)> (new_max - arr[i])){
				arr[i] -= k;
			}
			else{
				arr[i] +=k;
			}
			

			 new_min = Math.min(arr[i], new_min);
			 new_max = Math.max(arr[i],new_max);
			
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ "      ");
		}
		System.out.println();
		return new_max - new_min;
		
	}
}
