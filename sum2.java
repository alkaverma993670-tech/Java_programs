import java.util.Scanner;
class mytext{
public static void main(String arg[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of a:");
	int a=sc.nextInt();
	System.out.println("enter the value of b:");
	int b=sc.nextInt();
	int sum=a+b; 
	System.out.println("sum="+sum);
}
}