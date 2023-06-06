import java.io.Serializable;

public class CharCreator implements Serializable {
    // race, class, name
    private static String name;
    private static String race;
    private static String class;
    
    System.out.println("What will your character's name be?");
    name = scan.nextLine();

    System.out.println("What will your character's class be?");
    class = scan.nextline();

    return "You are " + name + ", a " + race + " in the " + class + " class.";
}