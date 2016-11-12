package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class anagramClass {
	
	public static void main(String[] args){
		
		String str1="karan";
		String str2="akran";
		
		//boolea=anagram(str1,str2);
		
		//System.out.println("reverse of String  " + original+"  is  "+ reversed);
		if(anagram(str1,str2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	//	System.out.println(deletedString(str1,'b'));
	}
	
	public static boolean anagram(String s1,String s2){
		
		char[] arrS1=s1.toCharArray();
		char[] arrS2=s2.toCharArray();
		System.out.println("before for loop");
		
		for(int i=0;i<arrS1.length;i++){
			System.out.println("inside for loop");
			int index=s2.indexOf(arrS1[i]);
			System.out.println(index+"  "+ arrS1[i]);
			if(index!=-1){
				s2=s2.substring(0, index)+s2.substring(index+1,s2.length());
				System.out.println(s2);
			}else{
				return false;
			}
		}
		
		if(s2.isEmpty()){
		System.out.println("fbibdu  ");
		}else{
			System.out.println("fsif fa ");
		}
		return s2.isEmpty();

	}
	
	public static String deletedString(String s,char c){
		String newS="";
		try{
		if(c==' ')
			return null;
		else{
			
			int index=s.indexOf(c);
			if(index!=-1)
			newS= s.substring(0, index)+s.substring(index+1,s.length());
			else
				System.out.println("string does not contain this character");
				return s;
			
		}
		}catch(Exception e){
			System.out.println("value is null to one of the two input");
		}
		return newS;
	}
}
