import java.util.ArrayList;
public class dwarf {
    
    private int abilityScore;
    private String size;
    private int speed;
    private ArrayList<String> abilities = new ArrayList<String>(); 

    public String hillDwarfStats(){
        
        abilityScore = 3;
        size = "medium";
        speed = 25;
        abilities.add("Darkvision");
        abilities.add("Dwarven Resilience");
        abilities.add("Dwarven Combat Training");
        abilities.add("Tools proficiency");
        abilities.add("Stonecunning");
        abilities.add("Read, Speak, Write Dwarvish");
        abilities.add("Read, Speak and Write Common");
        abilities.add("Hit Point increases by 1");
        abilities.add("Dwarven Toughness");
        
        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "Abilities: " + abilities.toString();
    }

    public String mountainDwarfStats(){
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

        return "Ability Score: " + abilityScore + "\nSize: " + size + "\nSpeed: " + speed + "Abilities: " + abilities.toString();
    }
}

