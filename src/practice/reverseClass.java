package practice;
import java.util.Stack;

public class reverseClass {
	
	//private static final int Stack = 0;

	public static void main(String[] args){
		
		//String original="KaraNidhi";
		
		//String reversed=reverse(original);
		
		//System.out.println("reverse of String  " + original+"  is  "+ reversed);
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(-1);
		s.push(14);
		s.push(10);
		System.out.println(minFind(s));
		s.push(1);
		
		System.out.println(minFind(s));
		
		
	}
	
	public static String reverse(String s){
		
		char[] arr=s.toCharArray();
		
		for(int i=0,j=arr.length-1;i<j;i++,j--){
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		String t=arr.toString();
		return new String(arr);
	}
	
	public static int minFind(Stack<Integer> s1){
		if(s1.isEmpty())
			return Integer.MAX_VALUE;
		int x=s1.pop();
		int smallest=minFind(s1);
		
		if(x<smallest)
			smallest=x;
		s1.push(x);
		return smallest;
	}
	

}
