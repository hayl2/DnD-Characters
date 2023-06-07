import java.util.*;
public class Game{
    public static void main (String[] args){
        
        //variables
        String race;
        String subrace;
        String classDnD;
        String name;

        //implementing scanner
        Scanner scan = new Scanner(System.in);

        //introduction to game
        System.out.println("Hello! Welcome to DnD character guide");
        System.out.println("What would you like to do?");
        System.out.println("a) View information for a race\nb) View information for a class\nc)Create a character\nd)Find a prexsisting character's race or class.");
        
        //what would the user like to do?
        String str = scan.nextLine();

        //Start of while loop
        while (str.equals("a") == false && str.equals("b") == false && str.equals("c") == false && str.equals("d") == false){
            System.out.println("It looks like that didn't match any options. Try again. ");
            str = scan.nextLine();
        }

        //checking cases
        switch(str){

            //want to view race info
            case "a":
                System.out.println("What race would you like to view information for?");
                race = scan.nextLine();
                if (race.equalsIgnoreCase("Dwarf")){
                    System.out.println("What subrace of 'Dwarf' are you?");
                    subrace = scan.nextLine();
                    
                    switch(subrace){
                        case "hill":
                            System.out.println(Dwarf.hillDwarfStats());
                            break;
                        case "mountain":
                            System.out.println(Dwarf.mountainDwarfStats());
                            break;
                        default:
                            System.out.println("It looks like that didn't match an option. Restart and try again");
                            break;
                    }

                }
                else if (race.equalsIgnoreCase("elf")){
                    System.out.println("What subrace of 'elf' are you?");
                    subrace = scan.nextLine();

                    switch(subrace){
                        case "high":
                            System.out.println(Elf.highElfStats());
                            break;
                        case "mountain":
                            System.out.println(Elf.woodElfStats());
                            break;
                        default:
                            System.out.println("It looks like that didn't match any subraces. Restart and try again.");
                            break;
                    }

                }

                else if (race.equalsIgnoreCase("halfling")){
                    System.out.println("What subrace of 'halfling' are you?");
                    subrace = scan.nextLine();

                    switch(subrace){
                        case "lightfoot":
                            System.out.println(Halfling.lightfootHalflingStats());
                            break;
                        case "stout":
                            System.out.println(Halfling.stoutHalflingStats());
                            break;
                        default:
                            System.out.println("It looks like that didn't match any subraces. Restart and try again.");
                            break;
                    }
                }
                else{
                    System.out.println("Viewing human.");
                    System.out.println(Human.humanStats());
                }
                break;
            // want to view class info
            case "b":
                System.out.println("What class would you like to view information for?");
                classDnD = scan.nextLine();
                if(classDnD.equalsIgnoreCase("Wizard")){
                    System.out.println(Wizard.wizardStats());
                }
                else if (classDnD.equalsIgnoreCase("bard")){
                    System.out.println(Bard.bardStats());
                }
                else if (classDnD.equalsIgnoreCase("Rogue")){
                    System.out.println(Rogue.rogueStats());
                }
                else if (classDnD.equalsIgnoreCase("Ranger")){
                    System.out.println(Ranger.rangerStats());   
                }
                break;

            //want to create character
            case "c":
                System.out.println("What race would you like your character to be?");
                race = scan.nextLine();
                System.out.println("What class would you like your character to be?");
                classDnD = scan.nextLine();
                System.out.println("What would you like to name your character?");
                name = scan.nextLine();

                CharCreator.addCharacter(name, race, classDnD);
                System.out.println(CharCreator.getMapString());
                CharCreator.getMap().save();
                break;
            
                //view characters
            default: 
                System.out.println("What character would you like to view?");
                name = scan.nextLine();
                System.out.println("Looking for " + name);
                
                
                
                break;
            
            }

        
        
        
        //closing scanner to prevent resource leaks
        scan.close();
    }
}