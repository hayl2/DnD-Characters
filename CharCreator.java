import java.io.Serializable;
import java.util.Scanner;

public class CharCreator extends Game {
    Scanner scan = new.Scanner(System.in);

    private static String name;
    private static String race;
    private static String classDND;
    
    System.out.println("What will your character's name be?");
    name = scan.nextLine();

    System.out.println("What will your character's class be?");
    classDND = scan.nextline();

<<<<<<< Updated upstream
    return "You are " + name + ", a " + race + " in the " + classDND + " class.";
}
=======
public Character (String name, String race, String class) {
    this.race;
    this.class;
}
>>>>>>> Stashed changes
