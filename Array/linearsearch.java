import java.util.*;

public class linearsearch {
    
  public static int linear(int number[], int key ){
     for( int i=0; i<number.length; i++){
              if( number[i] == key ){
                   return i;
              }  
       } 
        return -1;
   }
   public static void main( String args[] ){
    int number[] = { 2,3,4,5,6,7,9,20 };
    int key = 4;

    int index = linear( number, key);
    if( index == -1 ){
        System.out.println("key NOT found");
    }
    else{
        System.out.println("key is at index : "+ index); 
    }
   }
}
