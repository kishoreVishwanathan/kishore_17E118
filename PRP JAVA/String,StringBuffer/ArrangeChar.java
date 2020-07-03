import java.util.Scanner;

public class ArrangeChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<a.length() ||i<b.length();i++ )
		{
			if(i<a.length())
			{
				sb.append(a.charAt(i));
			}
			if(i<b.length())
			{
				sb.append(b.charAt(i));
			}
		}
	}

}
