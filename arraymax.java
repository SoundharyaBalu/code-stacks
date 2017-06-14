import java.util.Scanner;
import java.util.Arrays;
class arraymax
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[25];
for(int i=0;i<25;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.print(a[24]);
}
}
