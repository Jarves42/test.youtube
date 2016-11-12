package practice;
import java.util.Scanner;
public class lonelyNumberMain {
		
	public static void main(StringDemo[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the odd size of array");
		int size= sc.nextInt();
		
		int[] array= new int[size];
		for(int i=0;i<array.length;i++){
			
			System.out.println("Enter "+(i+1)+"th elements of array");
			array[i]=sc.nextInt();
	}
		lonelyNumber obj = new lonelyNumber();
		int number = obj.lonelyNumber(array);
		System.out.println("lonely number is "+ number);
		
	}
	
}
