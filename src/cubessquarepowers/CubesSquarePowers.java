/*
Callum MacLeod
23/10/2018
ICS3U Mr. Kaune
 */

package cubessquarepowers;
import java.util.Scanner;
/**
 *
 * @author camac2045
 */
public class CubesSquarePowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        int choice = 0;//declaring variables
        int base = 0;
        int base2 = 0;
        int exponent = 0;
        int menu = 0;
    
        do {//starting menu
            System.out.println("---Dank Exponent Program---");
            System.out.println("");
            System.out.println("Please Enter Your Choice");
            System.out.println("1… Find the value of a number squared");
            System.out.println("2… Find the value of a number cubed");
            System.out.println("3… Find the value of a number, to any power");
            System.out.println("4… Exit");
            choice = keyedInput.nextInt();//choice input
            
            if (choice == 1) {
                System.out.println("Please enter the base for the square");
                base = keyedInput.nextInt();
            for (int i = 0; i<1; i++){
                base = base*base;
            }
                System.out.println(base);
            }
            
            if (choice == 2) {
                System.out.println("Please enter the base for the cube");
                base = keyedInput.nextInt();
            for (int i = 0; i<1; i++){
                base = base*base*base;
            }
                System.out.println(base);
            }
            
            while (choice == 3) {
                System.out.println("Please enter the base for the exponent");
                base = keyedInput.nextInt();
                base2 = base;
                System.out.println("Please enter the exponent");
                exponent = keyedInput.nextInt();
            for (int i = 2; i<=exponent; i++){   
                base = base*base2;
            }
                System.out.println(base);
            }
        } while (choice != 4);

                    if (choice == 4){
                        System.out.println("Thanks for using the program!");
                    }
        
    
    }
}
