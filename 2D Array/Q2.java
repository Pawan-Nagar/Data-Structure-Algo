import java.util.*;

public class Q2 {
    
    public static void sumrow(int nums[][], int row ){
     
        int sum = 0;
              for(int j=0; j<nums[row].length; j++){
                   sum += nums[row][j];
              }
        System.out.print(sum);
    }
    public static void main( String args[]){
        int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};

        Scanner sc =  new Scanner(System.in);
        System.out.print("Entre the row num, you to sum :  ");
        int row = sc.nextInt();

        sumrow(nums, row);

    }
}
