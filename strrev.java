import java.util.*;
class strrev
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashSet<Character> hs=new HashSet<Character>();
		//System.out.println("ENTER THE STRING");
		String ss=sc.nextLine();
		char[] ch=ss.toCharArray();
		for(char c:ch)
		{
			hs.add(c);
		}
		for(char c:hs)
		{
			System.out.print(c);
		}
	}
}
