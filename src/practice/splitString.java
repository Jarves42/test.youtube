package practice;

public class splitString {

	
	public static void main(String[] args){
		
		String st="ka,ra,n,pa,te,lk,";
		String[] arrString=splitStr(st);
		System.out.println(arrString.length);
		for(int i=0;i<arrString.length;i++){
			System.out.println(arrString[i]+" splited String   ");
		}
	}
	
	public static String[] splitStr(String s){
		String[] strArr=new String[7];
		if(s==null)
			return null;
		int i=0;
		int count=0;
		while(i<s.length()){
			
			int index=s.indexOf(',');
			System.out.println(index);
			System.out.println(s.substring(0, index)+" i "+i);
			if(index!=-1){
			//	System.out.println(index);
				//System.out.println(s.substring(0, index));
				//System.out.println(s+"     gap    "+strArr[count]);
				strArr[count++]=s.substring(0,index);
				s=s.substring(index+1,s.length());
				i=index+i;
			}else{
			//	System.out.println(index+" i ");
				//System.out.println(s.substring(0, s.length()+1));
				strArr[count++]=s.substring(0,s.length()+1);
				i=s.length();
			}
		}
		return strArr;
	}
//	return strArr;
}
