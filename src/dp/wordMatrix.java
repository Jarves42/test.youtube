package dp;

public class wordMatrix {
	
	public static void main(String[] args) {
		char[][] matrix = { { 't', 'z', 'x', 'c', 'd' },
							{ 'a', 'h', 'n', 'z', 'x' }, 
							{ 'h', 'w', 'k', 'i', 'o' },
							{ 'o', 'r', 'n', 'r', 'n' }, 
							{ 'a', 'b', 'r', 'i', 'n' } };
		wordMatrix w = new wordMatrix();
		if (w.searchWord(matrix, "horizon")) {
			System.out.println(" PATH FOUND");
		} else {
			System.out.println("NO PATH FOUND");
		}

	}
	public boolean searchWord(char[][] matrix,String word){
		int l= matrix.length;
		
		for(int i=0;i<l;i++){
			for(int j=0;j<l;j++){
				if(search(matrix,word,i,j,0,l)){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean search(char[][] m ,String word ,int i,int j,int index,int l){
		
		if(m[i][j]==' ' || m[i][j]!=word.charAt(index)){
			return false;
		}
		
		if(index==l){
			System.out.println("Found");
			return true;
		}
		
		char temp=m[i][j];
		m[i][j]=' ';
		
		if(i+1<l && search(m,word,i+1,j,index+1,l)){
			return true;
		}
		
		if(i-1>=0 && search(m,word,i-1,j,index+1,l)){
			return true;
		}
		
		if(j+1<l && search(m,word,i,j+1,index+1,l)){
			return true;
		}
		
		if(j-1>=0 && search(m,word,i,j-1,index+1,l)){
			return true;
		}
		
		if(i+1<l && j-1>=0 &&search(m,word,i+1,j-1,index+1,l)){
			return true;
		}
		
		if(i+1<l && j+1<l &&search(m,word,i+1,j+1,index+1,l)){
			return true;
		}
		
		if(i-1>=0 && j-1>=0 &&search(m,word,i-1,j-1,index+1,l)){
			return true;
		}
		
		if(i-1>=0 && j-1<l &&search(m,word,i-1,j+1,index+1,l)){
			return true;
		}
		
		m[i][j]=temp;
		return false;
	}

}
