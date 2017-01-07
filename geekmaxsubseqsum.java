import java.util.*;
import java.lang.*;
import java.io.*;

public class geekmaxsubseqsum {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
		    int m = scan.nextInt();
		    int[] arr = new int[m];
		    for(int j=0;j<m;j++)
		    {
		        arr[j]=scan.nextInt();
		    }
		    int res = maxSumIS(arr,m);
		    System.out.println(res);
		}
	}
	 static int maxSumIS( int arr[], int n )
    {
       
		 
		 int i, j, max = 0;
        int msis[] = new int[n];
 
        /* Initialize msis values for all indexes */
        for ( i = 0; i < n; i++ )
            msis[i] = arr[i];
 
        /* Compute maximum sum values in bottom up manner */
        for ( i = 1; i < n; i++ )
            
                if ( arr[i] > arr[i-1] &&
                     msis[i] < msis[i-1] + arr[i])
                    msis[i] = msis[i-1] + arr[i];
 
        /* Pick maximum of all msis values */
        for ( i = 0; i < n; i++ )
            if ( max < msis[i] )
                max = msis[i];
 
        return max;
    }
}