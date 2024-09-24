 import java.util.*;

public class printsubarray {

    public static void printc(int number[]) {
         
        int ts=0;
        for( int i=0; i<number.length; i++ ){
             int start =i;
             for( int j=i+1; j<number.length; j++){
                int end = j;

                   for( int k=start; k<=end; k++){
                  System.out.print(number[k]+" ");
                   }
                   ts++;
                    System.out.println(); 
                   }   
                 System.out.println();                   
        }
        System.out.print(ts);
    }
    
   public static void main( String args[] ){

    int number[] = { 2,3,4,6,7 };

           printc(number);
   }

}
