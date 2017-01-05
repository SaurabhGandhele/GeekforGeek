import java.util.*;
import java.lang.*;
import java.io.*;

public class geekcircularprimeno {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0;i<n;i++)
		{
		    int m = scan.nextInt();
        int cnt=0;
        int flag=0;
		    String num = Integer.toString(m);
		    for(int j=0;j<num.length();j++)
		    {
		        int ch = Integer.parseInt(num);
		        if(checkprime(ch))
		        {
		            cnt++;
		        }
		        if(cnt==num.length())
		        {
		            flag=1;
		            break;
		        }
		        String temp1 = num.substring(0,1);
		        String temp2 = num.substring(1);
		        num=temp2+temp1;
		    }
		    if(flag==1)
		    System.out.println("1");
		    else
		    System.out.println("0");
		}
	}
	
	public static boolean checkprime(int m)
	{
		int track=0;
		int br=0;
	    for(int k=1; k<m; k++){
    
	    if(m%k==0){
        track++;
        }
	    
        if(track==2)
        {
        br=1;
        break;
        }
	    }
	    if(br==1)
	    	return false;
    else
    return true;
	    }
	
}