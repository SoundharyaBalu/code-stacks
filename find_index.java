import java.util.Scanner;
public class find_index {
public static void main(String[] args) {
Scanner n=new Scanner(System.in);
int s=n.nextInt();
int a[]=new int[s];
for(int i=0;i<s;i++)
{
a[i]=n.nextInt();
}
for(int i=0;i<a.length;i++)
{
if(a[i]==i)
{
System.out.println("The value same as index is :"+a[i]);
}
}
}
}
