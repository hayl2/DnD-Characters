import java.util.ArrayList;

public class Dwarf {

    private static int abilityScore;
    private static String size;
    private static int speed;
    private static ArrayList<String> abilities = new ArrayList<String>();

    public static String hillDwarfStats() {

        abilityScore = 3;
        size = "medium";
        speed = 25;
        abilities.add("Darkvision");
        abilities.add("Dwarven Resilience");
        abilities.add("Dwarven Combat Training");
        abilities.add("Tools proficiency");
        abilities.add("Stonecunning");
        abilities.add("Read, Speak, and Write Dwarvish");
        abilities.add("Read, Speak and Write Common");
        abilities.add("Hit Point increases by 1");
        abilities.add("Dwarven Toughness");

        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "\nAbilities: "
                + abilities.toString();
    }

    public static String mountainDwarfStats() {
        size = "medium";
        abilityScore = 4;
        speed = 25;
        abilities.add("Darkvision");
        abilities.add("Dwarven Resilience");
        abilities.add("Dwarven Combat Training");
        abilities.add("Tools proficiency");
        abilities.add("Stonecunning");
        abilities.add("Read, Speak, Write Dwarvish");
        abilities.add("Read, Speak and Write Common");
        abilities.add("Dwarven Armor Training");

        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "\nAbilities: "
                + abilities.toString();
    }
}
