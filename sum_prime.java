import java.util.Scanner;
class sum_prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0,sum=0;
    for(int i=1;i<=n;++i)
    {
        for(int j=2;j<=i/2;j++)
        {
            if(i%j==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            sum=sum+i;
        flag=0;
    }
    System.out.println("Sum of prime numbers:"+sum);
    }
}
