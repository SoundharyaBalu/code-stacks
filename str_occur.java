import java.util.*;
class str_occur
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=args[0];
        String sub=args[1];
        int count=0,ind;
        for(int i=0; i+sub.length()<=s1.length(); i++)    //i+sub.length() is used to reduce comparisions
        {
            ind=s1.indexOf(sub,i);
            if(ind>=0)
            {
                count++;
                i=ind;
                ind=-1;
            }
        }
        System.out.print(count);
    }
}
