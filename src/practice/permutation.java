package practice;

public class permutation {
	
public static void main(String[] args){
		
		String str1="kar";
		String str2="";
		
		permut(str1);

	}
	public static void permut(String str){
		permutString("",str);
	}
	
	private static void permutString(String per , String s){
		
		if(s.isEmpty()){
			System.out.println(per+s);
		}
		else{
			for(int i=0;i<s.length();i++){
				permutString(per+s.charAt(i),s.substring(0, i)+s.substring(i+1, s.length()));
			}
	}
		
}

}
