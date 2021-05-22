package newpackage;
public class TestClass
{
  public static void main(String[] args) 
  {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; i++) 
    {
      for(int j = 0; j < myNumbers[i].length; j++) 
      {
        System.out.println(myNumbers[i][j]);
      }
    }

    int c = 10;
    int d = 10;
   	c++;
    ++d;

    System.out.print("C : "+c);
    System.out.print("D : "+d); 
    c++;
    ++d;
    System.out.println("C : "+c);
    System.out.println("D : "+d); 
      

  }
}