import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
String s1=args[0];
String s2[]=s1.split(" ");
for(int i=s1.length()-1;i>=0;i--)
{
System.out.print(s2[i]+" ");
}
}
}
