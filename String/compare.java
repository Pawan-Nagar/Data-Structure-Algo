

public class compare {
    public static void main( String args[]){
        String fruit[] = {"apple","mango","banana"};
        
        String largest = fruit[0];

        for(int i=1; i<fruit.length; i++){
            System.out.print(largest.compareTo(fruit[i]));
            System.out.println();
            if(largest.compareTo(fruit[i]) < 0){
            largest = fruit[i];
            }
        }

        System.out.print(largest);
    }

}
