package mynewproject;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arry1 = {{1,2,3,4},{1,2,3,4}};
		int[][] arry2 = {{1,2,3,4},{1,2,3,4}};
		int[][] finalArray = new int[4][4];
		for(int i = 0; i<arry1.length;++i) 
		{
			for(int j = 0; j<arry1[i].length;++j)
			{
				finalArray[i][j] = arry1[i][j]+arry2[i][j];
			}
		}
		for(int i = 0; i<arry1.length;i++) 
		{
			for(int j = 0; j<arry1[i].length;j++)
			{
				System.out.print(finalArray[i][j]+" ");
			}
			System.out.println();
		}


	}

}
