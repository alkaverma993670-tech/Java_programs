class odd{
public static void main(String args[]){
	int num=1;
	while(num<=10){
	System.out.println(num);
	num=num-1;
	num=num+2;

}
System.out.println(num);
}
}


/* num starts at 1

The condition is while(num <= 10) → true
Inside the loop:
It prints num
num = num - 1 → goes down by 1
num = num + 2 → then goes up by 2
👉 Net effect: num increases by 1 every loop
So the values printed are:1 2 3 4 5 ......
num = 11

The program goes back to check the condition: while (num <= 10)
11 <= 10 → false
Control moves outside the loop and print 11 */