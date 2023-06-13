import java.util.ArrayList;

public class Wizard {

    private static int hitPoints=6;
    private static ArrayList<String> proficiencies = new ArrayList<String>();

    public static String wizardStats() {

        int roll = Dice.roll6();

        proficiencies.add("Weapons");
        proficiencies.add("Intelligence");
        proficiencies.add("Two of: Arcana, History, Insight, Investigation, Medicine, Religion");

        return "Hit Dice: " + roll + "\nHit Points (Plus Constitution Modifier): " + hitPoints + "\nProficiencies: "
                + proficiencies.toString();
    }

}
