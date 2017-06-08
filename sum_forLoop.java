import java.util.Scanner;
class sum_forLoop
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.print(i+"is :"+sum);
}
}
