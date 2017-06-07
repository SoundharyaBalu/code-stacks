import java.util.Scanner;
class leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num%400==0)
{
System.out.print("leap year");
}
else
{
System.out.print("not leap year");
}
}
}
