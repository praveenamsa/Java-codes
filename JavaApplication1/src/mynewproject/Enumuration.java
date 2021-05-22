package mynewproject;

public class Enumuration {

	enum Books
	{
		tamil,
		english,
		maths
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books mybooks = Books.english;
		switch(mybooks)
		{
			case tamil:
				System.out.println("Tamil Book");
				break;
			case english:
				System.out.println("English Book");
				break;
			case maths:
			System.out.println("maths Book");
				break;
		}

	}

}
