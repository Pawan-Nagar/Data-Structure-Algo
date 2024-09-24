import java.util.*;

public class count {
    
    public static void countSort(int arr[]){

        int largest = Integer.MIN_VALUE;

        for(int i: arr) {
            largest = Math.max(largest,i);
        }

        int count[] = new int[largest + 1];
        for(int i: arr){
            count[i]++;
        }

        int j=0;
        for(int i: count){
             while(i > 0){
                arr[j] = i;
                j++;
                i--;;
             }
        }

    }

    public static void main( String aegs[] ){
        int arr[] = {5,4,1,3,2};
       
        countSort(arr);

        for(int i:arr) System.out.print(i+"  ");
        
    }
}
