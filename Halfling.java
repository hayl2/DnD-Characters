import java.util.ArrayList;

public class Halfling {
    private static int abilityScore;
    private static String size;
    private static int speed;
    private static ArrayList<String> abilities = new ArrayList<String>(); 

    public static String lightfootHalflingStats(){
        
        abilityScore = 3;
        size = "small";
        speed = 25;
        abilities.add("Lucky");
        abilities.add("Brave");
        abilities.add("halfling Nimbleness");
        abilities.add("Trance");
        abilities.add("Read, Speak and Write Common");
        abilities.add("Read, Speak and Write Halfling");
        abilities.add("Naturally Stealthy");
        
        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "\nAbilities: " + abilities.toString();
    }

    public static String stoutHalflingStats(){
        size = "small";
        abilityScore = 3;
        speed = 25;
        abilities.add("Lucky");
        abilities.add("Brave");
        abilities.add("halfling Nimbleness");
        abilities.add("Trance");
        abilities.add("Read, Speak and Write Common");
        abilities.add("Read, Speak and Write Halfling");
        abilities.add("Stout Resilience");
        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "\nAbilities: " + abilities.toString();
    }
}
