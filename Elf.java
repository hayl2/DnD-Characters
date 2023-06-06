import java.util.ArrayList;
public class elf {

    private static int abilityScore;
    private static String size;
    private static int speed;
    private static ArrayList<String> abilities = new ArrayList<String>(); 

    public static String highElfStats(){
        
        abilityScore = 3;
        size = "medium";
        speed = 30;
        abilities.add("Darkvision");
        abilities.add("Keen Senses");
        abilities.add("Fey Ancestry");
        abilities.add("Trance");
        abilities.add("Read, Speak, and Write Elvish");
        abilities.add("Read, Speak and Write Common");
        abilities.add("Elf Weapon Training");
        abilities.add("Cantrip");
        abilities.add("Read, Speak, and Write one extra language of your choice.");
        
        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "\nAbilities: " + abilities.toString();
    }

    public static String woodElfStats(){
        size = "medium";
        abilityScore = 3;
        speed = 30;
        abilities.add("Darkvision");
        abilities.add("Keen Senses");
        abilities.add("Fey Ancestry");
        abilities.add("Trance");
        abilities.add("Read, Speak, and Write Elvish");
        abilities.add("Read, Speak and Write Common");
        abilities.add("Elf Weapon Training");
        abilities.add("Fleet Of Foot");
        abilities.add("Mask of the Wild");
        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "\nAbilities: " + abilities.toString();
    }
}