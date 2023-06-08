import java.util.ArrayList;

public class Wizard {

    private static int roll;
    private static int hitPoints;
    private static ArrayList<String> proficiencies = new ArrayList<String>();

    public static String wizardStats() {

        roll = Dice.roll6();
        hitPoints = 6;
        proficiencies.add("Weapons");
        proficiencies.add("Intelligence");
        proficiencies.add("Two of: Arcana, History, Insight, Investigation, Medicine, Religion");

        return "Hit Dice: " + roll + "\nHit Points (Plus Constitution Modifier): " + hitPoints + "\nProficiencies: "
                + proficiencies.toString();
    }

}