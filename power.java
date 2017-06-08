import java.util.Scanner;
class power
{
  public static void main(String arg[])	
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=sc.nextInt();
    int result=1;
    if(n>=0&&p==0)
     {
        result=1;
     }
    else if(n==0&&p>=1)
      { 
         result=0;
      }
    else
     {
         for(int i=1;i<=p;i++)
	    {
            result=result*n;
 	    }	    
     }
    System.out.println(n+"^"+p+"="+result);
  }
}
