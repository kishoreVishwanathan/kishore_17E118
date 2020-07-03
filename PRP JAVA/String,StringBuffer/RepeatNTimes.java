import java.util.Scanner;

public class RepeatNTimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			System.out.println(str.substring(l-n));
		}

	}

}
