import java.util.Scanner;
import java.util.HashMap;
public class Game{
    public static void main (String[] args){
        
        //variables
        String race;
        String subrace;

        //implementing scanner
        Scanner scan = new Scanner(System.in);

        //creating a hashmap
        HashMap<String, String> exsisting = new HashMap<String, String>();

        //introduction to game
        System.out.println("Hello! Welcome to DnD character guide");
        System.out.println("What would you like to do?");
        System.out.println("a) View information for a race\nb) View information for a class\nc)Create a character\nd)Find a prexsisting character's race or class.");
        
        //what would the user like to do?
        String str = scan.nextLine();

        while (str.equals("a") == false && str.equals("b") == false && str.equals("c") == false && str.equals("d") == false){
            System.out.println("It looks like that didn't match any options. Try again. ");
            str = scan.nextLine();
        }
        switch(str){
            case "a":
                System.out.println("What race would you like to view information for?");
                race = scan.nextLine();
                if (race.equalsIgnoreCase("Dwarf:")){
                    System.out.println("What subrace of 'Dwarf' are you?");
                    subrace = scan.nextLine();
                    
                    switch(subrace){
                        case "hill":
                            dwarf.hillDwarfStats();
                            break;
                        case "mountain":
                            dwarf.mountainDwarfStats();
                            break;
                        default:
                            System.out.println("It looks like that didn't match an option. Restart and try again");
                            break;
                    }

                }
                break;
            case "b":
                System.out.println("What class would you like to view information for?");
                //TODO
                break;
            case "c":
                System.out.println("What race would you like your character to be?");
                //TODO
                break;
            default: 
                System.out.println("What character would you like to view?");
                //TODO
                break;
            
            }
        
        
        
        //closing scanner to prevent resource leaks
        scan.close();
    }
}