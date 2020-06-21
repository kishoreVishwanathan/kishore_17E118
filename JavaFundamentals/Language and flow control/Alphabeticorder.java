
public class Alphabeticorder {

	public static void main(String[] args) {
	String s=args[0];
	String s1=args[1];
	char c=s.charAt(0);
	char ch=s1.charAt(0);
	if(c<ch)
	{
		System.out.println(c+","+ch);
	}
	else
	{
		System.out.println(ch+","+c);	
	}
	
	}

}
