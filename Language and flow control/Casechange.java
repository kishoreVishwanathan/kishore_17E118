
public class Casechange {

	public static void main(String[] args) {
		String s=args[0];
		char c=s.charAt(0);
		if(c>=65&&c<90)
		{
			System.out.println(Character.toLowerCase(c));
		}
		else
		{
			System.out.println(Character.toUpperCase(c));
		}
	}

}
