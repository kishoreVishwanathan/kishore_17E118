
public class Gender {

	public static void main(String[] args) {
		String s=args[0];
		int n=Integer.parseInt(args[1]);
		
if(s.equals("Female")&&(n>=1&&n<=58))
{
	System.out.println("The percentage of intrest is 8.2%");
}
else if(s.equals("Male")&&(n>=1&&n<=58))
{
	
	System.out.println("The percentage of intrest is 8.4%");
}

else if(s.equals("Female")&&(n>=59&&n<=100))
{
	System.out.println("The percentage of intrest is 9.2%");
}
else if(s.equals("Male")&&(n>=58&&n<=100))
{
	System.out.println("The percentage of intrest is 10.5%");
}
	}

}
