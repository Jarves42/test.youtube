package practice;

public class recuPrintXtoY {
	
	public static void main(String[] args){
		int x=9;
		int y=15;
		
		printRecursive(x,y);
		
		recuPrintXtoY obj=new recuPrintXtoY();
		System.out.println(obj);
		
		
	}
	
	public static void printRecursive(int a,int b){
		
		if(b==a)
			return;
		else{
			printRecursive(a, --b);
			System.out.println(b);
		}
	}

}
