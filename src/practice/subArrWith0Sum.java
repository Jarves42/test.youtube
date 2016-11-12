package practice;
import java.util.*;

public class subArrWith0Sum {
	
	public static void findSubArray(int[] arr,int size){
		
		HashMap<Integer,Vector<Integer>> map=new HashMap<Integer,Vector<Integer>>();
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			
			if(sum==0){
				System.out.println("SubArray found from index 0 to  "+i);
			}
			
			if(map.get(sum)!=null){
				Vector<Integer> temp=map.get(sum);
				//System.out.println("insize if part");
				for(int it=0;it<temp.size();it++){
					System.out.println("SubArray found from index  "+(temp.get(it)+1)  + "to  "+i);
				}
				temp.add(i);
				map.put(sum, temp);
			}else{
				//System.out.println("insize else part");
				Vector<Integer> temp=new Vector();
				temp.add(i);
				map.put(sum, temp);
				
			}
			
	/*		if(map.get(sum)==null){
				Vector<Integer> temp=new Vector();
				temp.add(sum);
			}else{
				Vector<Integer> temp=map.get(sum);
				
			}
		*/	
		}
	}
	public static void main(String[] args){
		
		int[] arr={6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
		
		int size=arr.length;
		
		findSubArray(arr,size);
	}
	

}
