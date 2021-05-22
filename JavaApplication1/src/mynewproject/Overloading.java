package mynewproject;
import java.util.Scanner;
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number to add");
		int b = obj.nextInt();
		System.out.println(recursive(b));
		name("paraveen");
		name("Praveen","Durga");
	}
	static int recursive(int a)
	{
		if(a>0)
			return a + recursive(a-1);
		else
			return 0;
	}
	static void name(String a)
	{
		System.out.println(a);
	}
	static void name(String a,String b)
	{
		System.out.println(a + " " +b);
	}	
	
}


