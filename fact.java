import java.util.Scanner;
class fact
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int f=1;
for(int i=0;i<n;i++){
f=f*i;}
System.out.println("factorial of "+n+"is:"+f);
}
}
