import java.util.*;
class Vowels
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
StringBuffer sb=new StringBuffer(sc.next());
System.out.println(sb.reverse());
String s=new String(sb);
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
{
char c=ch[i];
if(c!='a' && c!='e' && c!='i' && c!='u' && c!='o')
{
System.out.print(c);
}
}
}
}
