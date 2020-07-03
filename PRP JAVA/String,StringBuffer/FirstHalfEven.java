import java.util.Scanner;

public class FirstHalfEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int len=str.length();
		if(len%2==0)
		{
			System.out.println(str.substring(0,(len/2)));
		}
		else
		{
			System.out.println("null");
		}

	}

}
