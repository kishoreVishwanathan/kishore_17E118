
public class Receivedcommand {

	public static void main(String[] args) 
	{
		
int n=args.length;
if(n==0)
{
	System.out.println("No values");
}
else
{
	System.out.println(args[0]);
for(int i=1;i<n;i++)
{

	System.out.println(","+args[i]);
}
}

}
}
