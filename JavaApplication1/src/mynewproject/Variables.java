package mynewproject;



public class Variables {
	public static void main(String[] args) {
		int n = 1,m = 1;
		String[] names = {"praveen", "durga", "PD75"};
		float pointValue = 75.75f;
		char ch= 'a';
		String name = "Praveen\"Agrud75 re";
		boolean bool = true;
		for(String i: names)
		{
			System.out.println(i);
		}
		
		System.out.println("Length of the string is: "+name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.indexOf("re"));
		System.out.println(name.concat(name));
		System.out.println((int)(Math.random()*101));

		
		
	}

}
