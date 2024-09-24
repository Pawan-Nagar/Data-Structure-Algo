import java.util.Scanner;
import java.util.*;
//leetcode 73

public class rahul {
    // rahuk bhai ne question diya h ki...
    //matrix m zero h kahi bhi to us case m matrix k row or coloumn ko, zero zero krdo include that posistion too

    public static void replaceZero( int matrix[][], int str){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               if(matrix[i][j] == 0){
                  str++;
                  }
               }
            }

          
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                   if(matrix[i][j] == 0){
                    while(str>0){
                      zero(matrix, i, j);
                      } }
                    }
                }
}

        public static void zero(int matrix[][], int i, int j){
            for( int k=0; k<matrix.length; k++){  // for row
                if(k==i){
                     for(int z=0; z<matrix[0].length; z++){
                        matrix[k][z] = 0;
                     }
                }
            }

            for( int k=0; k<matrix[0].length; k++){  //for column
                if(k==j){
                     for(int z=0; z<matrix.length; z++){
                        matrix[z][k]=0;
                     }
                }
            }
        }
        

         public static void print(int matrix[][]){
        //loop to print the matrix after detecting the zero
         for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print( matrix[i][j]);
            }
            System.out.println();
         }
        }

    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("entre the no row of matrix :");
         int row = sc.nextInt();
        System.out.print("entre the no column of matrix :");
         int col = sc.nextInt();

        int matrix[][] = new int[row][col];
  
        System.out.print(" entre the value for the matrix");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++)
                matrix[i][j] = sc.nextInt();
            }
           replaceZero(matrix, 0);
           print(matrix);
        }
    }