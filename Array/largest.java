 import java.util.*;

public class largest {
    
    public static int large( int number[] ){
        int largest = Integer.MIN_VALUE;  // JAVA ki language m ye infinity h minus mai
       int smallest = Integer.MAX_VALUE;   /// largest smallest hii logic hai BOSS

        for( int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }
            if( smallest>number[i]){
                smallest = number[i];
            }
        }
          System.out.print("smallest is : "+ smallest );
          return (largest);
    }

    public static void main( String args[] ){
        int number[] = { 2,5,6,0,8,9,5,44,33,23};

        System.out.print(" Largest number is : "+large(number));
    }
}
