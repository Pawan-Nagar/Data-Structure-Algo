import java.util.*;

public class binarysearch{

    public static int search( int number[] , int key){  
       int start = 0, end = number.length-1; 
       while( start <= end ){  
        int mid = ( start + end) / 2;
            if( number[mid] == key ){
             return mid;
           }
             if(number[mid]<key){
             start = mid+1;
           }
            else{
             end = mid-1;
            }
       }
       return -1;
     }

        public static void main( String args[] ){
        int number[] = { 2,5,7,8,9,23,44 };
        int key = 1;
    
         System.out.print("index for key is : "+search(number,key));

        }
    }
