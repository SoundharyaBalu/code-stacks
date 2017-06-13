import java.util.Scanner;
class ascii_avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String uname=sc.next();
        char ch[]=uname.toCharArray();
        int a[]=new int[uname.length()];
        int sum=0;
        for(int i=0;i<uname.length();i++)
        {
            a[i]=(int)ch[i];
            sum=sum+a[i];
        }
        int ss=sum/uname.length();
        char s=(char)ss;
        System.out.print(s);
    }
}

