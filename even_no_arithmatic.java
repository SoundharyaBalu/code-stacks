import java.util.Scanner;
class even_no_arithmatic
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=num>>1<<1;
        if(num1==num)
            System.out.print(num+" is even");
        else
            System.out.print(num+" is not even");
    }
}

