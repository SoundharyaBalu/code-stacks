import java.util.*;
class remove_duplicate{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        for(int i=0;i<sb.length();i++)
        {
            for(int j=i+1;j<sb.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                sb.deleteCharAt(j);
            }
        }
        System.out.println(sb);
    }
}
