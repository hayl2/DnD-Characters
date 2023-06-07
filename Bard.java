import java.util.ArrayList;

public class Bard {
  private static int roll;
  private static int hitPoints;
  private static ArrayList<String> proficiencies = new ArrayList<String>();

  public static String bardStats() {

    roll = Dice.roll8();
    hitPoints = 8;
    proficiencies.add("Armor");
    proficiencies.add("Weapons");
    proficiencies.add("Tools");
    proficiencies.add("Charisma, Dexterity");
    proficiencies.add("Choose any three skills");

    return "Hit Dice: " + roll + "\nHit Points (Plus Constitution Modifier): " + hitPoints + "\nProficiencies: "
        + proficiencies.toString();
  }
}
