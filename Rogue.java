import java.util.ArrayList;

public class Rogue {
    private static int roll;
    private static int hitPoints;
    private static ArrayList<String> proficiencies = new ArrayList<String>();

    public static String rogueStats() {

        roll = Dice.roll8();
        hitPoints = 8;
        proficiencies.add("Armor");
        proficiencies.add("Weapons");
        proficiencies.add("Tools");
        proficiencies.add("Intelligence, Dexterity");
        proficiencies.add(
                "Four of: Acrobatics, Athletics, Deception, Insight, Intimidation, Investigation, Perception, Performance, Persuasion, Sleight of Hand, Stealth");

        return "Hit Dice: " + roll + "\nHit Points (Plus Constitution Modifier): " + hitPoints + "\nProficiencies: "
                + proficiencies.toString();
    }

}
