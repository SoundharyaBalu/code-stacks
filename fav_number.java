import java.util.*;
class fav_number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String ss[]=new String[4];
int m=5,n=10,x=0,y=0;
while(n<=s.length())
{
ss[]=substring(m,n).split("");
x=0;
for(int i=0;i<4;i++)
{
x=x+Integer.parseInt(ss[i]);
}
while(x>9)
{
y=0;
for(int i=0;x!=0;i++)
{
y=y+(x%10);
x=x;
}
}
}
}
}
