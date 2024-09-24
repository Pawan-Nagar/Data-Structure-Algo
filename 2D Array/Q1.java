public class Q1 {
    
    public static void findCount(int array[][], int key){
        int count = 0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){  // yaad rkhna array, colum ki sizejo hoti h ,vo hum row se  pta krengee
                  if(array[i][j] == key){  
                    count += 1;
                  }       
            }
        }
        System.out.print(count);
    }
     public static void main( String args[] ){
        int array[][] = {{4,9,8},{7,7,7}};
        int key = 7;
   
        findCount(array, key);
     }
}
