import java.util.*;
public class Uunique
{
    public static void main(String args[])
    {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            temp=temp^arr[i];
               
        }
         System.out.println(temp);
    }
    
}
