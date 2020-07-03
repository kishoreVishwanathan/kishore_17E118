
public class TrueorFalse {

	public static void main(String[] args) {
		int arr[]=new int[args.length];
		for(int i=0;i< args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1 || arr[i]==4)
			{
				count++;
			}
		}
		if(count==arr.length)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
