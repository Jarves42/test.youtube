package palindrome;
import java.util.Scanner;

public class palindromeMain {
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size ; i++){
			System.out.println("Enter the size of "+(i+1)+"array element");
			arr[i]=sc.nextInt();
		}
		
		palindromeMerge obj = new palindromeMerge(arr);
		System.out.println(obj.isPalindrome(arr));
		
		
	}
}
