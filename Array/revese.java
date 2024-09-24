 import java.util.*;

public class revese {
                 
    public static void reverses( int number[] ){
       int first = 0, last = number.length-1;

       while(first < last){

              int temp = number[last];
          number[last] = number[first];
         number[first] = temp;

          first++;
           last--;
         
        }
    }

    public static void main( String args[] ) {
        int number[] = { 2,3,4,5,6 };


         reverses(number);  
         for( int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
         }
         System.out.println();
            }  
}
