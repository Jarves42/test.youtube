package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
        int size=4*n-1;
        char[][] pettern=new char[size][size];
       
       
        int totalDot=2*n-1;
        for(int i=0;i<2*n;i++){
        	int j=0;
        	int reverse=size-1;
        	
        	for(;j<totalDot;j++){
        		pettern[i][j]='.';
        		pettern[i][reverse--]='.';
        	}
        	
        	for(int v=0;v<=i;v++){
        		pettern[i][j++]='x';
        		if(j<size)
        		pettern[i][j++]='.';
        	}
        	
        	
        	totalDot--;
        }
        
        
        for(int i=0;i<(size/2)+1;i++){
        	for(int j=0;j<size;j++){
        		pw.print(pettern[i][j]);
        	}
        	pw.println("");
        }
        
        for(int i=(size/2)-1;i>=0;i--){
        	for(int j=0;j<size;j++){
        		pw.print(pettern[i][j]);
        	}
        	pw.println("");
        }
        pw.close();
    }
}