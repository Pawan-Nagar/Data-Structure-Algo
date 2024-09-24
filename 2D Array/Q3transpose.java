import java.util.*;

public class Q3transpose {
     
     // building a transpose to get the transpose of the function
    
     public static void transPose(int nums[][]){

     System.out.print("Here the GAME of tanspose begins :  "+ "\n");

     int n = nums.length;
     int m = nums[0].length;

      for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
           System.out.print(nums[j][i]);
        }
        System.out.println();
      }
     }
    public static void main( String args[]){
        int nums[][] = new int[2][3];

        System.out.print("entre the element of the matrix");
        Scanner sc = new Scanner(System.in);

       // get the input of the matrix 
        for(int i=0; i<nums.length;i++){
             for(int j=0; j<nums[0].length; j++){
                  nums[i][j] = sc.nextInt();
             }
            }

        //how matrix look like after input
        for( int i=0; i<nums.length; i++){
             for(int j=0; j<nums[0].length; j++){
               System.out.print(nums[i][j]);
             }
             System.out.println();
        }

        transPose(nums);
        }
    }

