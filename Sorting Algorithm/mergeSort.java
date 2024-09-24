import java.util.*;


public class mergeSort {
    
    public static void mS(int arr, int si, int ei){

        int mid = si + (ei-si)/2;

        mS(arr,si,mid);
        mS(arr,mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){

            int temp []= new int[ei-si+1];

            int i = si;
            int j = ei;
            int k = 0;

            
            while( si <= mid && mid <= ei){
                if(arr[i] < arr[j]){
                    temp[k] = arr[i];
                    i++;
                }
                else{
                    temp[k] = arr[j];
                }
            }


    }
    public static void main( String aegs[] ){
        int arr[] = {5,4,1,3,2};
       
        mS(arr, 0, arr.length);

        for(int i:arr) System.out.print(i+"  ");
        
    }
}
