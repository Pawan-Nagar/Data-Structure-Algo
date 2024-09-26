import java.util.*;

public class Q4_anagrams {
    //to chec k the entre string are ana-gram or not

    public static void anaGram(String str1, String str2){

        int ok = str1.length();
        int start = 0;

        for( int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    start +=1;
                }
            }
        }

        if( start == ok){
            System.out.print("Yes the given string are ana-gram");
        }
        else{
            System.out.print("No, they are not ana-grams ");
        }

    }

    public static void main( String args[]){
        Scanner sc = new Scanner( System.in);
    
        System.out.print("entre the first word : ");
        String str1 = sc.nextLine();

        System.out.print("entre the second word : ");
        String str2 = sc.nextLine();

        if(str1.length() == str2.length()){
           anaGram(str1, str2);
        }
        else{
            System.out.print("Given string are of the diffrent size : ");
        }

    }
}
