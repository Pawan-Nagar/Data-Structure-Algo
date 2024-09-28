//given a number like 2019 , you have to convert it into the string like "two zero one nine"

public class no_string{

    static String digit[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

     public static void printDigit(int n){

      if(n == 0){
        return;
      }

       int lastDigit = n%10;    // yha agar mai simple logic se krta to  mujhe reverse krna padta apne output ko..
       printDigit(n/10);       // but recursion ki wjh se mujhe ye use nhi krna padna, kiyoki value stack me use hoti hai
       System.out.print(digit[lastDigit]+" ");
    }

    public static void main( String args[]){
        printDigit(1947);
    }
}