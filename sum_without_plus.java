import java.util.Scanner;
class sum_without_plus
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=b;i>0;i--)
        a++;
        System.out.print("SUM:"+a);
    }
}
