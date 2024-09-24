

public class diagonalmatrix {
    
    public static int diagonalSum(int matrix[][]){
      int sum = 0;         
        for(int i=0;i<matrix.length; i++){

            sum += matrix[i][i];
    
        if( i != matrix[0].length)
            sum += matrix[i][matrix.length-1-i];
        
     // return sum;
    }
       return sum;
    }
    public static void main( String args[]){
        int matrix[][] = {{1,2,13,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print(diagonalSum(matrix));
}
}