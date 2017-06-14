 import java.util.Scanner;
 class repeat_char
 {
 public static void main(String[] args) {
        String str="programming"; 
        int c=0;
        String nr="",r="";
        for(int i=0;i<str.length();i++)
            if(!nr.contains(str.charAt(i)+""))
                nr=nr+str.charAt(i);
            else
                r=r+str.charAt(i);
       //System.out.print(r); repeat filter
       // System.out.print(s); repeat chars
        for(int i=0;i<r.length();i++)
        {
            c=0;
            for(int j=0;j<nr.length();j++)
            {
                if(r.charAt(i)==nr.charAt(j))
                c++;
            }
            System.out.print(r.charAt(i)+":");
            System.out.println(c+1);
        }
    }
 }
