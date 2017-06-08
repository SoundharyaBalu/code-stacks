class prime_no
{
public static void main(String args[])
{
   int x=Integer.parseInt(args[0]);
   int y=Integer.parseInt(args[1]);
   int f=0,i;
   for(i=x; i<=y; i++)
   {
   for(int j=2;j<i;j++)
   {
       if(i%j==0)
       {
       f=1;
       break;
       }
    }
    }
    if(f==1)
    System.out.print(i+" ");
 }
}
