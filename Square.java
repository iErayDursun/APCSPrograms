// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.io.*;
import java.util.Scanner;

public class Square
{
    int[][] square;
    //--------------------------------------
    //create new square from a data file
    //--------------------------------------
    public Square(String filename) throws IOException
    {
        square = readSquare(filename);
    }

    //-----------------------------------
    //return size of the square
    //-----------------------------------
    public int size()
    {
        return square.length;
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int sum = 0;
        for(int x=0;x<square[1].length;x++){
            sum += square[row][x];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int sum = 0;
        for(int x=0;x<square.length;x++){
            sum += square[x][col];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int sum = 0;
        for(int x=0;x<square[0].length;x++) {
            sum += square[x][x];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int sum = 0;
        int col = square.length-1;
        for(int x=0;x<square[0].length;x++) {
            sum += square[x][col];
            col--;
        }
        return sum;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        int y = 0;
        for(int i=0; i<size(); i++) {
            if(sumCol(i)==sumRow(i) && sumCol(i)==sumMainDiag() && sumCol(i)==sumOtherDiag())
                y=1;
            else
                y=0;
        }
        if(y==1)
            return true;
        else
            return false;
    }
    //--------------------------------------
    //read info into the square from a file
    //--------------------------------------
    public int[][] readSquare(String fileName) throws IOException
    {
        Scanner scan = new Scanner (new File(fileName));
        int size = scan.nextInt();
        int [][] readSquare = new int[size][size];
        for (int row = 0; row < readSquare.length; row++)
            for (int col = 0; col < readSquare.length; col ++)
                readSquare[row][col] = scan.nextInt();
        return readSquare;
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for(int x=0;x<square.length;x++) {
            for(int y=0;y<square[0].length;y++)
                System.out.print(square[x][y] + "\t");
            System.out.println();
        }
    }
}