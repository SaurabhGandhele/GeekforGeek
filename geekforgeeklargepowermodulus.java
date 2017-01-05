import java.util.Scanner;


public class geekforgeeklargepowermodulus {
public static void main(String args[])
{
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	for(int i=0;i<n;i++)
	{
	    String s = scan.next()+scan.nextLine();
	    String [] str = s.split(" ");
	    int index=str[0].length()-1;
	    char temp=str[0].charAt(index);
	    int a=Character.getNumericValue(temp);
	    int b=Integer.parseInt(str[1]);
	    int c=Integer.parseInt(str[2]);
	    System.out.println(((int)Math.pow(a,b) % c));
	}
	
}
}
