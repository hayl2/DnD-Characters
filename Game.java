import java.util.Scanner;
public class Game{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Hello, and welcome to DnD Character Developer!");
        System.out.println("Let's start by chosing a race.");
        System.out.println("Dwarf");
        String race = scan.nextLine();

        if (race.equalsIgnoreCase("Dwarf")){
            System.out.println("What would you like your name to be?");
            String name = scan.nextLine();
            System.out.println("How old would you like your character to be?");
            int age = scan.nextInt();
            System.out.println("What tool would you like to use?");
            String tool = scan.nextLine();
            System.out.println("How tall would you like your character to be?");
            int size = scan.nextInt();
            System.out.println("What subrace would you like to be?");
            String subrace = scan.nextLine();
            switch (subrace){
                case "hill":
                    break;
                case "mountain":
                    break;
                default:
                    System.out.println("That wasn't one of the options. You have been assined hill.");
                    break;
            }

            Dwarf user  = new Dwarf(subrace, size, age, name, tool);
            getDwarf(user);
        }
    scan.close();
    }

    

   
}