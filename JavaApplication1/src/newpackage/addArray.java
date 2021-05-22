
package newpackage;
public class addArray
{
	public static void main(String[] args)
	{
		int[][] firstArray = {{2,2,2,2},{3,3,3,3},{4,4,4,4},{5,5,5,5,}};

		int[][] secondArray = {{2,2,2,2},{3,3,3,3},{4,4,4,4},{5,5,5,5,}};

		int[][] addArray = new int[5][5];

		for(int i = 0; i<firstArray.length; i++)
		{
			for(int j = 0; j < secondArray.length; j++)
			{
				addArray[i][j] = firstArray[i][j] + secondArray[i][j];

				System.out.print(addArray[i][j] + " ");
			} 
			System.out.println();
		}
	}
}