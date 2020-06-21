
public class ChechAlpha {

	public static void main(String[] args)
	{
	String s=args[0];
	char c=s.charAt(0);
	if((c>=65&&c<=90)||(c>=97&&c<=122))
	{
		System.out.println("Alphabhet");
	}
	else if(c>=48&&c<=57)
	{
		System.out.println("Digit");
	}
	else 
	{
		System.out.println("Special Character");
	}
	}

}
