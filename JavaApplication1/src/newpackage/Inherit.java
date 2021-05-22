package newpackage;
class OuterClass
{
    String name="Outer Class";
    class InnerClass
    {
        String name = "Inner Class";
    }
}
class Myclass
{
	String name = "Praveen K";
	void PrintName()
	{
		System.out.println("This is the parent class !!!");
	}
}
class Inherit extends Myclass
{
	protected String Carname = "Audio";
	public static void main(String[] args)
	{
		Inherit obj = new Inherit();
                OuterClass outerclass = new OuterClass();
                OuterClass.InnerClass innerclass =outerclass.new InnerClass();
                System.out.println(outerclass.name +" \n"+innerclass.name);

		obj.PrintName();
		
		System.out.println(obj.name +" "+ obj.Carname);

	}
}