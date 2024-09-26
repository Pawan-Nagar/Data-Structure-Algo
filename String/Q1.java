import java.util.*;

public class Q1{
    //this question is from the tutorial pratice questions
// how many times  lower case vowels occured in the string entre by the user

public static void main( String args[] ){
   
    System.out.print("entre the string : ");
    String str = new Scanner(System.in).nextLine();
    int count = 0;

    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if( (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ){
                 count += 1;
        }
    }
    
    System.out.print(count);
}
}
