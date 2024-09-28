
public class oddeven{

    public static void oddANDeven(int n){
      // int bitmas = 1;
        if( (n & 1) == 0 ){
            System.out.print("even number" + " ");
        }
        else{
            System.out.print("odd number" + " ");
        }
    }

    public static void main( String args[]){
        oddANDeven(2);
        oddANDeven(4);
        oddANDeven(17);
    }
}