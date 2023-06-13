import java.util.ArrayList;

public class Ranger {

    private static int hitPoints=10;
    private static ArrayList<String> proficiencies = new ArrayList<String>();

    public static String rangerStats() {

        int roll = Dice.roll10();
        proficiencies.add("Armor");
        proficiencies.add("Weapons");
        proficiencies.add("Strength, Dexterity");
        proficiencies.add(
                "Three of: Animal Handling, Athletics, Insight, Investigation, Nature, Perception, Stealth, Survival");

        return "Hit Dice: " + roll + "\nHit Points (Plus Constitution Modifier): " + hitPoints + "\nProficiencies: "
                + proficiencies.toString();
    }
}
