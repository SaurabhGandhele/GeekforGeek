import java.util.*;
import java.lang.*;
import java.io.*;

public class geekforgeekpairsame {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
			int m = scan.nextInt();
		    
			String temp = scan.next()+scan.nextLine();
		    String[] arr = temp.split(" ");
		    
		    HashSet<String> hs = new HashSet<String>();
		    int cnt=0;
		    for(int j=0;j<arr.length;j++)
		    {
		        if(hs.contains(arr[j]))
		        {
		            hs.remove(arr[j]);
		        }
		        else
		        {
		            hs.add(arr[j]);
		        }
		    }
		    System.out.println(hs.size());
		}
	}
}