
package runquad;
import java.util.*;

public class RunQuad {

    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in); 
    
        System.out.println("Press R for Rectangle or S for Sqaure");
        String choice = scn.next();
        
        if(choice.equalsIgnoreCase("R")){
            Rectangle r = new Rectangle();
            r.showDescription();
        }else if(choice.equalsIgnoreCase("S")){
            Square s = new Square();
            s.showDescription();
        }else{
            System.out.println("Invalid Input");
        }
    }
}

