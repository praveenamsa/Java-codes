package newpackage;
public class myarray
{
	public static void main(String[] args)
	{
		System.out.println("My array");
		int[][] a = {{ 1, 2, 3, 4}, {5, 6, 7, 8}};
		int[][] b = {{ 1, 2, 3, 4}, {5, 6, 7, 8}};
		int[][] add = new int[9][9];
		int i = 0;
		for(i = 0; i<a.length;i++)
		{
			for(int j = 0; j < a[i].length; j++ )
			{ 
				add[i][j] = a[i][j] * b[i][j];
				System.out.print(add[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Using For each loop");
		int[] y = { 1, 2, 3, 4};
		for(int x : y)
		{
			System.out.println(x);
		}

	}
	static void simpleAray()
	{
	
	}
}