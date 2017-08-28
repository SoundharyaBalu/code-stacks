import java.util.*;
class Kth_tallest
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[50];
    for(int i=0;i<50;i++){
    a[i]=sc.nextInt();
    }
    System.out.println("4th Tallest : "+a[a.length-4]);
    int k=sc.nextInt();
    if(k<50&&k>0)
    {
        System.out.println(k+"th Tallest : "+a[a.length-k]);
    }
    else
    {
    System.out.println("There is no "+k+"th Student in given list");
    }
  }
}
