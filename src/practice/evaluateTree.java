package practice;

public class evaluateTree {
	
	public static int evaluate(node root){
		
		if(root==null){
			return 0;
			
		}
		
		if(root.left==null && root.right==null){
			return Integer.parseInt(root.data);
		}
		
		int left_value=evaluate(root.left);
		int right_value=evaluate(root.right);
		
		if(root.data=="+"){
			return left_value+right_value;
		}
		
		if(root.data=="-"){
			return left_value-right_value;
		}
		
		if(root.data=="*"){
			return left_value*right_value;
		}
	return left_value/right_value;	
	}
	
	public static void main(String[] args){
		
		node root=new node("+");
		root.left=new node("*");
		root.left.left=new node("5");
		root.left.right=new node("4");
		
		root.right=new node("-");
		root.right.left=new node("100");
		root.right.right=new node("/");
		root.right.right.left=new node("20");
		root.right.right.right=new node("2");
		System.out.println(evaluate(root));
		
		
		
	}
	

}
