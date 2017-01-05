import java.util.*;
import java.lang.*;
import java.io.*;

public class geeklargestevenno {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
		    String s = scan.next();
		    String evenum = calceven(s);
		    System.out.println(evenum);
		}
	}
	public static String calceven(String s)
	{
	   
	    String res = "";
	    while(s.length()>0)
	    {
	        int index=0;
	         int max=-1;
	        for(int j=0;j<s.length();j++)
	        {
	            if(Character.getNumericValue(s.charAt(j)) > max )
	            {
	                max = Character.getNumericValue(s.charAt(j));
	                index = j;
	            }
	        }
	        s=s.substring(0,index)+s.substring(index+1);
	        res = res + max;
	        
	    }
	    if(Character.getNumericValue(res.charAt(res.length()-1))%2==0) 
	    return (res); 
	    else
	    {
	    	 StringBuilder myName = new StringBuilder(res);
	        for(int k=res.length()-1;k>=0;k--)
	        {
	           if(Character.getNumericValue(res.charAt(k))%2==0)
	           {
	               char temp = res.charAt(k);
	               
	               myName.setCharAt(k, res.charAt(res.length()-1));
	               myName.setCharAt(res.length()-1, temp);
	               break;
	           }
	        }
	        String oddres = "";
		    String testodd=myName.toString();
		    char add = testodd.charAt(testodd.length()-1);
		    testodd=testodd.substring(0, testodd.length()-1);
		    while(testodd.length()>0)
		    {
		        int index1=0;
		         int max1=-1;
		        for(int j=0;j<testodd.length();j++)
		        {
		            if(Character.getNumericValue(testodd.charAt(j)) > max1 )
		            {
		                max1 = Character.getNumericValue(testodd.charAt(j));
		                index1 = j;
		            }
		        }
		        testodd=testodd.substring(0,index1)+testodd.substring(index1+1);
		        oddres = oddres + max1;
		        
		    }
		    String lamp= oddres + Character.toString(add);
		    return lamp;
	    }
	    
	}
}