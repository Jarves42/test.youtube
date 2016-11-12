package dp;
import java.util.*;
import java.io.*;
public class findMid {
	 static int mid;
	 
	 public static void main(String[] args) throws Exception{
		 
		 FileReader file = new FileReader("C:\\test\\a.txt");
	        BufferedReader fileInput = new BufferedReader(file);
	         
	        // Print first 3 lines of file "C:\test\a.txt"
	        for (int counter = 0; counter < 3; counter++) 
	            System.out.println(fileInput.readLine());
	         
	        fileInput.close();
		 Stack<Integer> s=new Stack<Integer>();
		 s.push(1545);
		 s.push(11);
		 s.push(1);
		 s.push(2);
		 s.push(3);
		 s.push(4);
		 s.push(5);
		 s.push(6);
		 s.push(7);
		 
		 System.out.println(findMidEle(s, 0));
	 }
	 
	 public static int findMidEle(Stack<Integer> s , int n){
		 
		 if(s.isEmpty()){
			 mid=n;
			 //System.out.println(mid + " "+n);
			 return 0;
		 }
		 
		 int ele=s.pop();
		 int midEle=findMidEle(s, n+1);
		 //System.out.println(mid+"mid");
		 if(n==mid-1){
			// System.out.println("final if"+ n);
			 midEle=ele;
		 }
		 s.push(ele);
		 return midEle;
		 
	 }
}
