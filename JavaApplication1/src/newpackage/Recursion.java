package newpackage;
public class Recursion
{
	public static void main(String[] args)
	{
		int result = sum(17);

		System.out.println("Sum of the value : " + result);

	}
	public static int sum(int n)
	{
		// n = 3
		if(n > 0)// 3 > 0
		{
			return n + sum(n - 1); // 3 + sum(3 - 1) --> 3 + sum(2)
		}
		else
		{
			return 0;
		}
	}
}