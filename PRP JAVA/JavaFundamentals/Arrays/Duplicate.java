import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		int arr[]=new int[args.length];
		int i;
		for(i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(arr);
		int j=0;
		for(i=0;i<arr.length-1;i++)
		{
		
				if(arr[i]!=arr[i+1])
				{
					
					arr[j++]=arr[i];
				}
		}
			arr[j++]=arr[arr.length-1];
			for( i=0;i<j;i++)
			{
				System.out.println(arr[i]+" ");
			}
		
		}
}
