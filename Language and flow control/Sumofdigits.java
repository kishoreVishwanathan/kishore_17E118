
public class Sumofdigits {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int sum;
		for(sum=0;n!=0;n/=10)
				{
			sum+=n%10;
				}
		System.out.println("Digit Sum="+sum);
	}

}
