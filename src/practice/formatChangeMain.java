package practice;
import java.util.Arrays;
import java.util.Scanner;
public class formatChangeMain {
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] parts=input.split(":");
		
		char[] amOrpm=parts[2].toCharArray();
		
		if(amOrpm[2]=='A'){
			if(parts[0].equals("12")){
				parts[0]="00";
			}
			System.out.println(parts[0]+":"+parts[1]+":"+parts[2]);
		}else{
			if(parts[0]=="12"){
				parts[0]="12";
			}else{
				int time=Integer.parseInt(parts[0])+12;
				parts[0]=""+time+"";
			}
			System.out.println(parts[0]+":"+parts[1]+":"+parts[2]);
		}
	}

}
