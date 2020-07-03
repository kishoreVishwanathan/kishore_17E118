
public class Calculator 
{
	public Calculator()
	{
		
	}
	public static int powerInt(int num1,int num2)
	{
		int product=1;
		for(int i=0;i<num2;i++)
		{
			product*=num1;
			
		}
		return product;
	}
	public static double powerDouble(double num1,int num2)
	{
		double product=1;
		for(int i=0;i<num2;i++)
		{
			product*=num1;
			
		}
		return product;
	
		
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.powerDouble(2.2,2));
		System.out.println(c.powerInt(6,2));
	}

}
