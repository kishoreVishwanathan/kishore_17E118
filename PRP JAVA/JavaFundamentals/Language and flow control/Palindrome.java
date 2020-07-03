
public class Palindrome {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int temp=0;
		int rem;
		int rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(n==rev)
		{
			System.out.println(n+ "is a Palindrome");
		}
		else
			
		{
			System.out.println(n+ "is not a Palindrome");
		}

	}

}
