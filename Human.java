import java.util.ArrayList;

public class Human {
    private static int abilityScore;
    private static String size;
    private static int speed;
    private static ArrayList<String> abilities = new ArrayList<String>();

    public static String humanStats() {

        abilityScore = 1;
        size = "medium";
        speed = 30;
        abilities.add("Read, Speak and Write Common");
        abilities.add("Proficiency in one skill");
        abilities.add("Gain one feat");

        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "\nAbilities: "
                + abilities.toString();
    }
}
