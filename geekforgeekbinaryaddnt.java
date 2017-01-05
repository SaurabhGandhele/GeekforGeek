import java.util.*;
import java.lang.*;
import java.io.*;

public class geekforgeekbinaryaddnt {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
		    int m = scan.nextInt();
		    String input0 =scan.next() + scan.nextLine();
            String input1 = "1";
		    // Use as radix 2 because it's binary    
             int first = input0.length() - 1;
    int second = 0;
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    while (first >= 0 || second >= 0) {
        int sum = carry;
        if (first >= 0) {
            sum += input0.charAt(first) - '0';
            first--;
        }
        if (second >= 0) {
            sum += '1' - '0';
            second--;
        }
        carry = sum >> 1;
        sum = sum & 1;
        sb.append(sum == 0 ? '0' : '1');
    }
    if (carry > 0)
        sb.append('1');

    sb.reverse();
    System.out.println(String.valueOf(sb));
        }
	}
}