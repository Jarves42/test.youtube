package practice;
import java.util.*;
public class subArrayWithGivenSum {
	
	public static void findTotalPairGivenSum(int[] arr,int sum){
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		int totalPair=0;
		
		for(int i=0;i<arr.length;i++){
			
			
			int diff=sum-arr[i];
			if(map.get(diff)!=null){
				totalPair+=map.get(diff);
			}
			
			if(map.containsKey(arr[i])==true){
				int incre=map.get(arr[i]);
				map.put(arr[i], incre++);
			}else{
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(totalPair);
	}
	
	public static void main(String[] args){
		int[] arr= {1, 5, 7, -1, 5};
		
		int sum=6;
		
		findTotalPairGivenSum(arr, sum);
	}

}
