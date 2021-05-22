package temppack;

public class ArrayClass 
{
    public static void main(String[] args)
    {
        int row = 2, column = 4;
        int[][] firstArray = {{2,3,4,5},{6,7,8,9}};
        int[][] secondArray = {{2,3,4,5},{6,7,8,9}};
        int[][] finalArray = new int[2][4];
        int[][] multiplicationArray = new int[row][column];
        System.out.println("First Matrix");
        for (int[] firstArray1 : firstArray) {
            for (int j = 0; j < firstArray1.length; j++) {
                System.out.print(firstArray1[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix");
        for (int i=0; i<firstArray.length;i++)
        {
            for(int j=0; j<firstArray[i].length; j++)
            {
                System.out.print(secondArray[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0; i<firstArray.length;i++)
        {
            for(int j=0; j<firstArray[i].length; j++)
            {
                finalArray[i][j]=firstArray[i][j]+secondArray[i][j];
            }
        }
        System.out.println("Sum of two matrix");
        for (int i=0; i<firstArray.length;i++)
        {
            for(int j=0; j<firstArray[i].length; j++)
            {
                System.out.print(finalArray[i][j]+" ");
            }
            System.out.println();
        }
        
    }    
}
