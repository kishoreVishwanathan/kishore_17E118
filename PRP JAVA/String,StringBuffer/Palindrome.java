import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer sb=new StringBuffer(str);
		String str1=sb.reverse().toString();
		if(str.equals(str1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome ");
		}
	}

}
