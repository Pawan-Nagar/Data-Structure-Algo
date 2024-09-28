// give N size of the array, you have to find the index of the occurance of key, input given by the User

public class number{

public static void occuranceIndx(int arr[], int key, int i){
    if(i == arr.length){
      return;
    }

    if(arr[i] == key){
      System.out.print( i + " ");
    }

    occuranceIndx(arr, key, i+1);

}
public static void main(String args[]){

    int arr[] = {2,2,4,5,6,2,7,2,2};
    int key = 2;
    occuranceIndx(arr, key, 0);
}
}