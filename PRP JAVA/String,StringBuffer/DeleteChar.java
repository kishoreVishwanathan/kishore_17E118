import java.util.Scanner;

public class DeleteChar {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String str=sc.nextLine();
	 StringBuffer sb=new StringBuffer(str);
	 int i=sb.indexOf("*");
	 System.out.println(sb.delete(i-1, i+2));
	}

}
