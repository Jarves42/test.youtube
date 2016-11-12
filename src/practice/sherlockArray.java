package practice;
import java.util.Scanner;
public class sherlockArray {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int tcases=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<tcases;i++){
			int size=Integer.parseInt(sc.nextLine());
			int[] ele=new int[size];
			
			for(int j=0;j<size;j++){
				ele[j]=sc.nextInt();
			}
			IsSherlockArr(ele,size);
			sc.nextLine();
		}
	}
	
	public static void IsSherlockArr(int[] arr,int s){
		int[] forwSum=new int[s];
		int[] reveSum=new int[s];
		int rSum=0;
		int fSum=0;
		forwSum[0]=fSum;
		reveSum[s-1]=rSum;
		
		for(int i=0,j=s-1;i<s-1;i++,j--){
			fSum+=arr[i];
			forwSum[i+1]=fSum;
			rSum+=arr[j];
			reveSum[j-1]=rSum;
		}
		
		for(int i=0;i<s;i++){
			if(forwSum[i]==reveSum[i]){
			System.out.println("YES");
			return;}
		}
		System.out.println("NO");
		return;
	}
	

}
