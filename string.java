import java.util.Scanner;
class text2 {
public static void main(String arg[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your name:");
	String name=sc.nextLine();
	System.out.println("enter your age:");
	String age=sc.nextLine();
	System.out.println("Hello " +name +  "and your age is " +age);
}
}