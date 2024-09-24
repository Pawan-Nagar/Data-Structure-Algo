import java.util.*;

 public class printmaxsumsubarray{

public static void sumsubarray( int number[] ){

     for( int i=0; i<number.length; i++){
       // int start = i;

        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int start = i;
        for( int j=i+1; j<number.length; j++ ){
            int end = j;

            currentsum = 0;
            for( int k = start; k<=end; k++){

               currentsum+= number[k];
               System.out.println( currentsum);
            }
              if(maxsum < currentsum){
                maxsum =  currentsum;
              }
            
        }
        System.out.println(); 
     }


}
public static void main( String args[] ){
    int number[] = { 2,4,6,7,11,99 };

    sumsubarray( number);
}
}