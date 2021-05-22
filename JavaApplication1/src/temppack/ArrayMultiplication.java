package temppack;

//package javaapplication1;

import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String args[])
    {
        System.out.println("Matrix multiplication");
        int row1, row2,col1,col2;
        int[][] firstMatrix= new int[100][100];
        int[][] secondMatrix = new int[100][100];
        int[][] finalMatrix = new int[100][100];
        Scanner obj = new Scanner(System.in);
        System.out.println("First matrix");
        System.out.print("Enter Row size :  ");
        row1 = obj.nextInt();
        System.out.print("Enter Coloum size : ");
        col1 = obj.nextInt();
        System.out.println("Enter elements of First Matrix");
        for(int i = 0; i<row1; i++)
        {
            for(int j = 0; j<col1;j++)
            {
                System.out.print("Enter the value of ["+i+"]["+j+"] : ");
                firstMatrix[i][j] =  obj.nextInt();
            }
        }
        System.out.println("Second matrix");
        System.out.print("Enter Row size :  ");
        row2 = obj.nextInt();
        System.out.print("Enter Coloum size : ");
        col2 = obj.nextInt();
        System.out.println("Enter elements of Second Matrix");
        for(int i = 0; i<row2; i++)
        {
            for(int j = 0; j<col2;j++)
            {
                System.out.print("Enter the value of ["+i+"]["+j+"] : ");
                secondMatrix[i][j] =  obj.nextInt();
            }
        }
        for(int i = 0; i<row1;i++)
        {
            for(int j = 0; j<col2;j++)
            {
                for(int  k = 0; k < col1; k++)
                {
                    finalMatrix[i][j] = finalMatrix[i][j] + firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        for(int i = 0; i<row1; i++)
        {
            for(int j = 0; j<col2;j++)
            {
                System.out.print(finalMatrix[i][j] + " ");
            }
            System.out.println();
        }   
    }
}
