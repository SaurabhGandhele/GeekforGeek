import java.util.*;
import java.lang.*;
import java.io.*;

public class geekLCS {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		for(int i=0;i<cnt;i++)
		{
		    int row = scan.nextInt();
		    int col = scan.nextInt();
		    int [][] S = new int[row+1][col+1];
		    String X = scan.next();
		    String Y = scan.next();
		    for(int j=0;j<row;j++)
		    S[j][0]=0;
		    for(int j=0;j<col;j++)
		    S[0][j]=0;
		    
		    for(int j=0;j<=row;j++)
		    {
		        for(int k=0;k<=col;k++)
		        {
		        	if (j == 0 || k == 0)
		                S[j][k] = 0;
		        	
		        	else if(X.charAt(j-1)==Y.charAt(k-1))
		            S[j][k]=S[j-1][k-1]+1;
		            
		        	else
		        	S[j][k]=Math.max(S[j-1][k],S[j][k-1]);
		        }
		    }
		    int max=-1;
		    
		    System.out.println(S[row][col]);
		}
	}
}