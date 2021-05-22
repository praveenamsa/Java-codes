package mynewproject;

class Person
{
	private String name;
	
	public String getName()
	{
		return name;
	}
	public void setName(String a)
	{
		this.name = a;
	}
}

public class Oops {

	int x,y;
	public Oops(int a, int b)
	{
		x = a;
		y = b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops obj1 = new Oops(2,5);
		Oops obj2 = new Oops(5,10);
		obj1.x = 10;
		System.out.println(obj1.x +" "+obj1.y);
		System.out.println(obj2.x+" "+obj2.y);
		Person pobj = new Person();
		pobj.setName("Durga");
		System.out.println("Get Name : "+pobj.getName());

	}

}

