
public class Reverse {

	public static void main(String[] args) {
		int len=args.length;
		int arr[][]=new int[2][2];
		if(len<4)
		{
			System.out.println("Enter the array values");
			
		}
		else
		{
			int k=0;
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					arr[i][j]=Integer.parseInt(args[k]);
							k++;
				}
			}
			System.out.println("The given array is :");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j>=0;j--)
				{
					System.out.println(arr[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
