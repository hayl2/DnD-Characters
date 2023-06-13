import java.util.ArrayList;

public class Elf {

    private static int abilityScore=3;
    private static String size="medium";
    private static int speed=30;
    private static ArrayList<String> abilities = new ArrayList<String>();

    public static String highElfStats() {
        abilities.add("Darkvision");
        abilities.add("Keen Senses");
        abilities.add("Fey Ancestry");
        abilities.add("Trance");
        abilities.add("Read, Speak and Write Common");
        abilities.add("Elf Weapon Training");
        abilities.add("Cantrip");
        abilities.add("Read, Speak, and Write one extra language of your choice.");

        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "\nAbilities: "
                + abilities.toString();
    }

    public static String woodElfStats() {
        abilities.add("Darkvision");
        abilities.add("Keen Senses");
        abilities.add("Fey Ancestry");
        abilities.add("Trance");
        abilities.add("Read, Speak, and Write Elvish");
        abilities.add("Read, Speak and Write Common");
        abilities.add("Elf Weapon Training");
        abilities.add("Fleet Of Foot");
        abilities.add("Mask of the Wild");
        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "\nAbilities: "
                + abilities.toString();
    }
}
