package mynewproject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "one"+1+2+"TWO"+"Three"+3+4;
		System.out.println(s);
		char ch = 'a';
//		for(int i = 1; i<=5; i++)
//		{
//			for(int j = 1; j<=i; j++)
//			{
//				System.out.print((char)(64+i));
//			}
//			System.out.println();
//		}
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
