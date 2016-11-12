package practice;
import java.util.Set;
public class isValidString {
	
	public static void main(String[] args){
		String[] dict={"mobile","samsung","sam","sung","man","mango",
                "icecream","and","go","i","like","ice","cream"};
		if(wordBreak("ilikesamsung",dict)){
			System.out.println("Yes");
		}else {  
			System.out.println("No");
		}
		
		if(wordBreak("iiiiiiii",dict)){
			System.out.println("Yes");
		}else {  
			System.out.println("No");
		}
		
		if(wordBreak("", dict)){
			System.out.println("Yes");
		}else {  
			System.out.println("No");
		}
		
		if(wordBreak("ilikelikeimangoiii", dict)){
			System.out.println("Yes");
		}else {  
			System.out.println("No");
		}
		
		if(wordBreak("samsungandmango", dict)){
			System.out.println("Yes");
		}else {  
			System.out.println("No");
		}
	
		if(wordBreak("samsungandmangokn", dict)){
			System.out.println("Yes");
		}else {  
			System.out.println("No");
		}
	}

	/*public static boolean isContain(String word){
		
		String[] dict={"mobile","samsung","sam","sung","man","mango",
                        "icecream","and","go","i","like","ice","cream"};
		int size=dict.length;
		
		for(int i=0;i<size;i++){
			if(dict[i].equals(word)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean breakWord(String str){
		int l=str.length();
		
		if(l==0)
			return true;
		
		for(int i=1;i<=l;i++){
			
			if (isContain( str.substring(0, i) ) &&
            breakWord( str.substring(i, l-i) ))
				return true;
			
			
		}
		
		return false;
	}*/
	
	public static boolean wordBreaker(String s,String[] dict){
		
		return workBreakHelper(s, dict, 0);
		
	}
	public static boolean workBreakHelper(String s,String[] dict,int start){
		
		if(start==s.length())
			return true;
		
		for(String a:dict){
			int len=a.length();
			int end=start+len;
			
			if(end>s.length())
				continue;
			
			if(s.substring(start, start+len).equals(a))
				if(workBreakHelper(s, dict, start+len))
				return true;
			
		}
		return false;
		
	}
	
	public static boolean wordBreak(String s, String[] dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why?
        //Because we need initial state
 
        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!t[i]) 
                continue;
 
            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;
 
                if(t[end]) continue;
 
                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
            }
        }
 
        return t[s.length()];
    }
	
}
