package dp;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
*/
import java.util.*;


public class TestClass {
    public static void main(String[] args ) throws Exception {
        
		Scanner sc = new Scanner(System.in);
		int tcase=Integer.parseInt(sc.nextLine());
       // System.out.println("Hello World!");
       
       for(int i=0;i<tcase;i++){
       		int N=sc.nextInt();
       		int M= sc.nextInt();
       		
       		int[][] mt = new int[N][M];
       		sc.nextLine();
       		
       		for(int l=0;l<N;l++){
       			for(int m=0;m<M;m++){
       				mt[l][m]=sc.nextInt();
       			}
       			sc.nextLine();
       		}
       		int startx=sc.nextInt();
       		int starty=sc.nextInt();
       		int maxJump=sc.nextInt();
       		
       		
       		
       		findPath(mt,startx,starty,maxJump);
       }
    }
    
    public static void findPath(int[][] mt,int sx,int sy,int mj){
    	
    	ArrayList<point> al = new ArrayList<point>();
    	int[] xcor = {0,-1,0,1};
    	int[] ycor=  {-1,0,1,0};
    	point obj=new point();
    	obj.x=sx-1;
    	obj.y=sy-1;
    	al.add(0,obj);
    	boolean decision = pathFindHelper(mt,sx-1,sy-1,mj,al,1,xcor,ycor);
    	
    	if(decision ==true){
    		System.out.println("YES");
    		System.out.println(al.size());
    		
    		for(int p=0;p<al.size();p++){
    			point object=al.get(p);
    			System.out.print(object.x+1+" ");
    			System.out.print(object.y+1);
    			System.out.println();
    		}
    	}
    	
    	
    }
    
    public static boolean pathFindHelper(int[][] mt,int sx,int sy,int mj,ArrayList<point> al,int index,int[] xcor,int[] ycor){
    	
    	if(sx==0 || sx==mt.length-1 || sy==0 || sy==mt[0].length-1){
    		return true;
    	}
    	
    	
    	
    	for(int i=0;i<4;i++){
    		
    		int newx=sx+xcor[i];
    		int newy=sy+xcor[i];
    	
    		if(isValid(newx,newy,mt) && Math.abs(mt[newx][newy]-mt[sx][sy])>=mj){
    			point obj=new point();
		    	obj.x=newx;
		    	obj.y=newy;
		    	al.add(index,obj);
		    	if(pathFindHelper(mt,newx,newy,mj,al,index+1,xcor,ycor))
		    		return true;
		    
		    	al.remove(index);
    		}
    	}
    	return false;
    }
    
    public static boolean isValid(int a,int b,int[][] mt){
    	return a>=0 && a<mt.length && b>=0 && b<mt[0].length;
    }
}
