package practice;

import java.util.Vector;


	
public class ancenstorMatrix {

	public static int ancestorMatrix(node root,Vector<Integer> al,int[][] mat){
		
		if(root==null)
			return 0;
		int data=root.data;
		
		for(int i=0;i<al.size();i++){
			mat[al.get(i)][data]=1;
		}
		
		al.add(root.data);
		int l=ancestorMatrix(root.left, al, mat);
		int r=ancestorMatrix(root.right, al, mat);
		
		al.remove(al.indexOf(root.data));
		return l+r+1;
		
	}
	
	public static void fillMatrix(node root){
		
		Vector<Integer> al=new Vector<Integer>();
		int[][] mat=new int[100][100];
		int size=ancestorMatrix(root, al, mat);
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(mat[i][j]+"  ");
		}
		System.out.println("");}
		
	}
	
	public static void main(String[] args){
		
		node root=new node(5);
		root.left=new node(1);
		root.left.left=new node(0);
		root.left.right=new node(4);
		
		
		root.right=new node(2);
		root.right.left=new node(3);
		
		
		fillMatrix(root);
	}

}
