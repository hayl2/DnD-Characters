import java.util.ArrayList;

public class Ranger {

    private static int roll;
    private static int hitPoints;
    private static ArrayList<String> proficiencies = new ArrayList<String>();

    public static String rangerStats() {

        roll = Dice.roll10();
        hitPoints = 10;
        proficiencies.add("Armor");
        proficiencies.add("Weapons");
        proficiencies.add("Strength, Dexterity");
        proficiencies.add(
                "Three of: Animal Handling, Athletics, Insight, Investigation, Nature, Perception, Stealth, Survival");

        return "Hit Dice: " + roll + "\nHit Points (Plus Constitution Modifier): " + hitPoints + "\nProficiencies: "
                + proficiencies.toString();
    }
}
