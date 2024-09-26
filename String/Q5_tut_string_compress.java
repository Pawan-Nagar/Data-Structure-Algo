public class Q5_tut_string_compress {
    

    public static String compressed_String( String str){
      String sc = "";

      for(int i=0; i<str.length(); i++){
        Integer count = 1;

        while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        sc += str.charAt(i);
        if(count>1){
            sc += count.toString();
        }
      } 
      return sc;
    }
    public static void main( String args[] ){
        String str = "aaabbccddd";
        System.out.print(compressed_String(str));
    }
}
