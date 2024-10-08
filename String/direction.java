// Q8 given a route cointaining four direction, find the shortested path
import java.util.*;

public class direction {
    
    public static float shortestPath( String path){

        int x=0;
        int y=0;

        for( int i=0; i<path.length(); i++){
           char direction = path.charAt(i);

           if( direction == 'E'){
            x++;
           } 
           else if( direction == 'W'){
           x--;
           }
           else if( direction == 'N'){
            y++;
           }
           else{
            y--;
           }
        }

        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
    }
public static void main(String args[]){
     String path = "WNEENESENNN";
     System.out.println(shortestPath(path));
}
}
