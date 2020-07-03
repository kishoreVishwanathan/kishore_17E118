
public class Sumandavg {

	public static void main(String[] args)
	{
		int  arr[]=new int[]{1,2,3,4,5};
		int sum=0;
		int len=arr.length;
		int avg=1;
		for(int i=0;i<len;i++)
		{
			sum+=arr[i];
			avg=sum/len;
		}
System.out.println("Sum=" +sum);
System.out.println("Average=" +avg);
	}

}
