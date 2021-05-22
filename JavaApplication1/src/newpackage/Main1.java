package newpackage;
public class Main1
{
	int modelYear;
	String modelName;

	public Main1(int x, String y)
	{
		modelYear = x;
		modelName = y;
	}

	public static void main(String[] args)
	{
		Main1 obj = new Main1(2000,"praveenagrud");
		System.out.println("Year : "+ obj.modelYear+" Name : "+obj.modelName);



	}
}