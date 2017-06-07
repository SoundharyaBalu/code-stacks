import java.util.Scanner;

public class alphabet_no
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
		
        if((ch=='a' && ch=='A') || (ch=='z' && ch=='Z'))
        {
            System.out.print("This is an Alphabet");
        }
        else
        {
            System.out.print("This is not an Alphabet");
        }
    }
}
