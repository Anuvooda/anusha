import java.io.*;
import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		int i,n,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		n=s.nextInt();
                while(n>0)
{
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
	System.out.print("factrial="+fact);
	}
	if(n<=0)
	{
		System.out println("given number is a negative number");
	}
}
}