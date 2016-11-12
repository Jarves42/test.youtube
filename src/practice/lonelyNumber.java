package practice;
import java.lang.reflect.Array;
import java.util.Arrays;

public class lonelyNumber {
	
	public int lonelyNumber(int array[]){
		int lnumber=0;

		if(array.length == 1){
			return array[0];
		}
		Arrays.sort(array);
		 
		 for(int i=0;i<array.length-3;i=i+2){
			 if(array[i]!=array[i+1]){
				 return array[i];
			 }
		 }
		return array[array.length -1];
	}

}
