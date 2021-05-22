package newpackage;
import java.util.*;

public class myfirst_program
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter End value : ");
		int n = obj.nextInt();
		myfirst_program new_obj = new myfirst_program();
		new_obj.new_method(n);
		simple();
		obj.close();
	}

	void new_method(int n)
	{

		for(int i = 1; i<=n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Even Number : "+i);
			}
			else
			{
				System.out.println("Odd Number : "+i);
			}

		}
	}
	static void simple()
	{
		final int a = 5;
		//a = 10; //will generate an error
		System.out.println("\n" +a);

		String name = "Praveen \"agrud\"";
		String name1 = "k";
		System.out.println("Length : "+name.length());
		System.out.println("Upper case : "+name.toUpperCase());
		System.out.println("Lower case : "+name.toLowerCase());
		System.out.println("Index : "+name.indexOf("agrud"));
		System.out.println(name +" "+ name1);
		System.out.println(name.concat(name1));
		System.out.println("Minimum value : "+Math.min(50, 10));  
		System.out.println("Square root of 100 : "+Math.sqrt(100)); 

	}
}



