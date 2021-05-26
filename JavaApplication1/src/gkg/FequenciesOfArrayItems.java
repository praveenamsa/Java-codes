package gkg;
//Java program to count frequencies of array items
import java.util.*;

class FequenciesOfArrayItems
{

 static void countFreq(int arr[][], int n)
 {
      Map<Integer, Integer> mp = new HashMap<>();

     // Traverse through array elements and
     // count frequencies
     for (int i = 0; i < arr.length; i++)
     {
    	 for(int j = 0; j<arr[i].length; j++)
    	 {
    		 if (mp.containsKey(arr[i][j]))
    		 {
    			 mp.put(arr[i][j], mp.get(arr[i][j]) + 1);
    		 }
    		 else
    		 {
    			 mp.put(arr[i][j], 1);
    		 }
    	 }
     }
     List<Integer> arrlist = new ArrayList<Integer>();
     // Traverse  through map and print frequencies
     
     for (Map.Entry<Integer, Integer> entry : mp.entrySet())
     {
         if(entry.getValue() >= n)
         {
        	arrlist.add(entry.getKey());
         }
     }
     System.out.println(arrlist);
 }

 // Driver code
 public static void main(String args[])
 {
	 Scanner in = new Scanner(System.in);
     int row = in.nextInt();
     int col = in.nextInt();
     int temp = 0;
     int arr[][] = new int[row][col];
     for(int i = 0; i<row; i++)
     {
        for(int j = 0; j<col; j++)
          {
              arr[i][j] = in.nextInt();
              
          } 
     }
     countFreq(arr, 2);
 }
}
