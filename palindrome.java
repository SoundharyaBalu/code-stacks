import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rs=0,x,y;
y=n;
  if(n>0)
  {
while(n>0)
{
x=n%10;
rs=rs*10+x;
n=n/10;
}
System.out.print(rs);
}
  else
    System.out.print("not a palindrome");
}
}
