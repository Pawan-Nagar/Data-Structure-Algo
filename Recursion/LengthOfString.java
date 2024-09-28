
import java.util.*;

public class LengthOfString {
    
    public static int length(String str){
       
        if(str.length() == 0){
            return 0;
        }
        
        return length(str.substring(1)) +1; // begining ki index daal diya to automatically vo end tk jaakr calculate krega
        
    }

    public static void main( String args[]){

        Scanner sc = new Scanner( System.in);
        System.out.print("entre the string you want :");
        String str = sc.nextLine();

        System.out.print(length(str));
    }
}
