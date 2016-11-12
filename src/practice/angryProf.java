package practice;
import java.util.*;
public class angryProf {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tcases=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<tcases;i++){
			int student=sc.nextInt();
			int thres=sc.nextInt();
			sc.nextLine();
			int count=0;
			int[] arrivalTime=new int[student];
			for(int j=0;j<student;j++){
			if(sc.nextInt()<=0){
				count++;
			}
			}
			if(count>=thres){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
			sc.nextLine();
		
			
			
		}
		
	}
	

}
