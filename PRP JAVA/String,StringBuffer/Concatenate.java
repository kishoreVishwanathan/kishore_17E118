import java.util.Scanner;

public class Concatenate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next().toLowerCase();
		String str1=sc.next().toLowerCase();
		if((str.charAt(str.length()-1))==(str1.charAt(0)))
		{
			System.out.println(str+str1.substring(1));
		}
		else
		{
			System.out.println(str+" "+str1);
		}

	}

}
