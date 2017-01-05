import java.util.*;
import java.lang.*;
import java.io.*;

public class geekKsmallestno {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		for(int i=0;i<n;i++)
		{
		    TreeMap<Integer,Integer> arr=new TreeMap<Integer,Integer>();  
		    int m = scan.nextInt();
		    for(int j=0;j<m;j++)
		    {
		        int temp = scan.nextInt();
		        arr.put(temp,j+1);
		    }
		        int k = scan.nextInt();
		        int temp=0;
		        Collection c = arr.keySet();

    //obtain an Iterator for Collection
    Iterator itr = c.iterator();

    //iterate through TreeMap values iterator
                while(itr.hasNext())
                {
		            if(temp<=k)
		            {
		                itr.next();
		                temp++;
		            }
		            else
		            {
                    System.out.println(""+itr.next());  
                    break;
		            }
		        }
        } 
		
	}
}