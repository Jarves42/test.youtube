package practice;

public class letterCount {

	public static void main(String[] args){
		
	/*	String s="axxbyybc";
		int i=1;
		
		switch(i){
		case 0:
			System.out.println("case 0");
			break;
		case 1:
			System.out.println("case 1");
		case 2:
			System.out.println("case 2");
			break;
		default :
			System.out.println("default");
		
		}*/
		//convertString(s);
		System.out.println(recur(3));
		
	}
	
	public static int recur(int x){
		
		if(x<=1)
			return 1;
		else 
			return recur(x-3)+ recur(x-1);
		
	}
	public static void convertString(String str){
		char[] arr=str.toCharArray();
		int size=str.length();
		int s=0;
		int store=1;
		//int 
		for(int i=1;i<size;i++){
			
			while(s>=0 && i<size && arr[i]==arr[s]){
				if(arr[i]==arr[i-1])
					arr[i-1]=' ';
				arr[i]=' ';
				arr[s]=' ';
				i++;
				if(s-1>=0){
					s--;
				}else{
					s=i;
					i++;
				}
			}	
				if(i<size){
					arr[++s]=arr[i];
					//arr[i]=' ';
					//i++;
				}
				
				
			
			
		}
		
		String newString=new String(arr);
		
		System.out.println(newString.trim());
	}
}
