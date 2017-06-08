import java.util.Scanner;
 
class count_digits {
    public static void main(String args[])
    {   
        int n, i=0;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        while(n>0)
        {
            n=n/10;
            i++;
        }
        System.out.println();
        System.out.println("Number of Digits present : "+i);
    }
}
