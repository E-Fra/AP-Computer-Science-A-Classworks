/**
* Classwork #1: Define the methods for problems #1-9
*/
public class TwoDArrayMethods
{

public static void main(String[] args)
{
// Decaling a 2D array in one line of code, to be used for testing
int[][] board = {{2, 4, 6, 8},
{1, 2, 7, 9},
{4, 6, 1, 10},
{1, 3, 11, 2}};
}

/* #1 Write a method for printing the elements in an array. Each row should
* be on its own line, so that the 2D array prints as a matrix of data

*/
public static void printMatrix(int[][] matrix)
{
    for(int i = 0; i < matrix.length; i++)
        for(int j = 0; j < matrix[0].length; j++)
            {
               System.out.print(matrix[i][j]);
            }
        System.out.println();
}
/*
* #2 Write a method to print the sum of all elements in the array. The
* The output should read:
* &quot;The sum of all elements in the array is 77
*/
public static void findTotal(int[][] matrix)
{
    int sum = 0;
    for(int i = 0; i < matrix.length; i++)
        for(int j = 0; j < matrix[0].length; j++)
            sum += matrix[i][j];
    System.out.println(sum);
}
/*
* #3 Write a method that prints the maximum value in the entire 2D array.
* For example, this method call in our main method on page 1 should read:
* &quot;The maximum value in the entire matrix is 11
*/
public static void findMax(int[][] matrix)
{
    int max = matrix[0][0];
    for(int i = 0; i < matrix.length; i++)
       for(int j = 0; j < matrix[0].length; j++)
            if(matrix[i][j] > max)
                max = matrix[i][j];
    System.out.println(max);
}
/* #4 Write a method for printing the sum of each row in the array

* For example, this method call in our main method should output:
* &quot;The sum of the elements in row 0 is 20.&quot;
* &quot;The sum of the elements in row 1 is 19.&quot; etc.
*/
public static void sumRows(int[][] matrix)
{   
    int rowSum = 0;
    for(int i = 0; i < matrix.length; i++)
    {   rowSum = 0;
        for(int j = 0; j < matrix[0].length; j++)
        {    
            rowSum += matrix[i][j];
        }
        System.out.println(rowSum);
    }       
}
/* #5 Write a method for finding the sum of each column in the array
* For example, this method call in our main method should output:
* &quot;The sum of the elements in column 0 is 8&quot;
* &quot;The sum of the elements in column 1 is 15&quot; etc.
*/
public static void sumColumns(int[][] matrix)
{
    int columnSum = 0;
    for(int i = 0; i < matrix.length; i++)
    {   columnSum = 0;
        for(int j = 0; j < matrix[0].length; j++)
        {    
            columnSum += matrix[j][i];
        }
        System.out.println(columnSum);
    }       
}
/* #6 Write a method for printing the largest value in each row.
* For example, this method call in our main method should output:

* &quot;The largest value in row 0 is 8&quot; etc.
* &quot;The largest value in row 1 is 9&quot; etc.
*/
public static void largestinRows(int[][] matrix)
{
    int maxRow = 0;
    for(int i = 0; i < matrix.length; i++)
    {   maxRow = 0;
        for(int j = 0; j < matrix[0].length; j++)
        {    
            if(matrix[i][j] > maxRow)
                maxRow = matrix[i][j];
        }
        System.out.println(maxRow);
    }       
}
/* #7 Write a method for printing the largest value in each column.
* For example, this method call in our main method should output:
* &quot;The largest value in column 0 is 4&quot; etc.
* &quot;The largest value in column 1 is 6&quot; etc.
*/
public static void largestinColumns(int[][] matrix)
{
    int maxColumn = 0;
    for(int i = 0; i < matrix.length; i++)
    {   maxColumn = 0;
        for(int j = 0; j < matrix[0].length; j++)
        {    
            if(matrix[i][j] > maxColumn)
                maxColumn = matrix[j][i];
        }
        System.out.println(maxColumn);
    }       
}
/*
* #8 Write a method that checks if the array is a square matrix

* A square matrix has the same number of rows and columns!
*/
public static boolean isSquare(int[][] matrix)
{
    return(matrix.length == matrix[0].length);
}
/*
* #9 Write a method that checks if the array is &quot;row-magic&quot;, which means
* that every row has the same row sum. You will need to change the values of
* the test array in the main method to do this.
*/
public static boolean isRowMagic(int[][] matrix)
{
    int rowSum = 0;
    for(int j = 0; j < matrix[0].length; j++)
    {    
        rowSum += matrix[0][j];
    }
    int rowSumNew = 0;
    for(int i = 1; i < matrix.length; i++)
    {   rowSumNew = 0;
        for(int j = 0; j < matrix[0].length; j++)
        {    
            rowSumNew += matrix[i][j];
        }
        if(rowSumNew != rowSum) 
            return false;
    }     
    return true;
    }     
/*
* #10 Write a method that checks if the array is &quot;column-magic&quot;, which means
* that every column has the same sum. You will need to change the values of
* the test array in the main method to do this.
*/
public static boolean isColumnMagic(int[][] matrix)
{
    int columnSum = 0;
    for(int j = 0; j < matrix.length; j++)
    {    
        columnSum += matrix[j][0];
    }
    int columnSumNew = 0;
    for(int i = 1; i < matrix.length; i++)
    {   columnSumNew = 0;
        for(int j = 0; j < matrix[0].length; j++)
        {    
            columnSumNew += matrix[j][i];
        }
        if(columnSumNew != columnSum) 
            return false;
    }     
    return true;
}

/*
* EXTENSION METHOD:

* #11 Write a method to determine if the array is a magic square, which
* means its row sums are equal, its column sums are equal, AND the sum of
* its diagonals are equal. You could use the methods above as &quot;helper&quot;
* methods!
*/
public static boolean isMagic(int[][] matrix)
{
    int diagonalOneSum = 0;
    for(int i = 0; i < matrix.length; i++)
       { 
           diagonalOneSum += matrix[i][i];
       }
    int diagonalTwoSum = 0;
    for(int j = (matrix[0].length-1); j >= 0; j--)
        { 
            for(int k = 0; k < matrix.length; k++)
                diagonalTwoSum += matrix[j][k];
        }
    return(diagonalOneSum == diagonalTwoSum && matrix.isColumnMagic() && matrix.isRowMagic );
}
}

