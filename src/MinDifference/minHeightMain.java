package MinDifference;

import java.util.Scanner;

public class minHeightMain {
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total number of tower");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size ; i++){
			System.out.println("Enter the size of "+(i+1)+"tower");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		
		minDiff obj = new minDiff(arr,k);
		int diff = obj.minDifference();
		
		System.out.println("Minmum difference is " + diff);
		
	}
}
