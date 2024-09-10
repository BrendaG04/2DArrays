/**
* A Java program for a matrix class that can add 
* and multiply arbitrary two-dimensional arrays of integer.
* @Since 09/06/2024
* @author Brenda Galdamez
*/

public class Arrays {

    public static void main(String[] args) {
        
        //Creating the first 2D Array    
        int [][] firstArray = {{5 , 2 , 3},
                               {4 , 5 , 6},
                               {7 , 8 , 9}}; 
        //Creating the Second 2D Array    
        int [][] secondArray = {{1 , 2 , 3},
                               {8 , 5 , 6},
                               {7 , 8 , 9}};
        //Calling method    
        printArrays(firstArray, secondArray);
        
        //Creating a new array with summations to print out results
        int [][]sumOfArrays = addArrays(firstArray, secondArray);
        
        //Loop to print out new Added Array  
        System.out.println("SUMMATIONS ARRAY:");
        for(int rows=0; rows < sumOfArrays.length; rows++){
            for (int columns=0; columns < sumOfArrays.length; columns++){
                System.out.print(sumOfArrays[rows][columns]+ " ");
            }System.out.println();
        } System.out.println("  ");   
        
        
        
        //Creating a new array with products to print out results
        int [][]productOfArrays = multiplyingArrays(firstArray, secondArray);
        
        //Loop to print out new products of Arrays  
        System.out.println("PRODUCT ARRAY:");
        for(int rows=0; rows < productOfArrays.length; rows++){
            for (int columns=0; columns < productOfArrays.length; columns++){
                System.out.print(productOfArrays[rows][columns]+ " ");
            }System.out.println();
        } System.out.println("  ");       
    
    }
   
    //Method to print originals 2D Array
    public static void printArrays(int[][]firstArray, int[][]secondArray){
        int row;  
        int column;
    
        System.out.println("FIRST ARRAY:");
        //Loop to print out first array     
        for(row=0; row < firstArray.length; row++){
            for (column=0; column < firstArray.length; column++){
                System.out.print(firstArray[row][column]+ " ");
            } System.out.println();
        } System.out.println("  ");
        
        
        System.out.println("SECOND ARRAY:");
        //Loop to print out second array             
        for(row=0; row < secondArray.length; row++){
            for (column=0; column < secondArray.length; column++){
                System.out.print(secondArray[row][column]+ " ");
            } System.out.println();
        } System.out.println("  ");        
    }
    
    //Method to add two 2D Arrays
    public static int [][] addArrays(int[][]firstArray, int[][]secondArray){
        int rows;
        int columns;
        int [][] sumOfArrays = {{0 , 0 , 0},
                                {0 , 0 , 0},
                                {0 , 0 , 0}};
        
        //Loop that runs through each digit from both arrays specific index
        //and adds them 
        for (rows=0; rows < firstArray.length; rows++){
            for (columns=0; columns < firstArray.length; columns++){
                 sumOfArrays[rows][columns] = firstArray[rows][columns] + secondArray[rows][columns];
            }
        }
        return sumOfArrays;
    }
    
    //Method to multiply two 2D Arrays
    public static int [][] multiplyingArrays(int[][]firstArray, int[][]secondArray){
        int rows;
        int columns;
        int [][] productOfArrays = {{0 , 0 , 0},
                                    {0 , 0 , 0},
                                    {0 , 0 , 0}};
        
        //Loop that runs through each digit from both arrays specific index
        //and multiplies them 
        for (rows=0; rows < secondArray.length; rows++){
            for (columns=0; columns < secondArray.length; columns++){
                 productOfArrays[rows][columns] = firstArray[rows][columns]*secondArray[rows][columns];
            }
        } 
        return productOfArrays;
    }  
}

