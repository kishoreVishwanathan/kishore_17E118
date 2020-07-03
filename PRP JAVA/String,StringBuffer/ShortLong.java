import java.util.Scanner;

public class ShortLong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int la=a.length();
		int lb=b.length();
		if(la>lb)
		{
			System.out.println(b+a+b);
		}
		else
		{
			System.out.println(a+b+a);
		}

	}

}
