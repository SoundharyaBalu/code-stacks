import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
int sum=0,m,n;
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
n=i;
while(n>0)
{
m=n%10;
sum=sum+(m*m*m);
n=n/10;
}
if(sum==i)
System.out.print("Armstrong number");
else
System.out.print("not Armstrong number");
}
}
