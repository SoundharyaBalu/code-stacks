import java.util.*;
class happy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,a=0;
while(n!=1)
{
while(n>0)
{
a=n%10;
sum+=(a*a);
n=n/10;
}
if(sum==1)
{
System.out.print("Happy Number");
break;
}
n=sum;
}
}
}
