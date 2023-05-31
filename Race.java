import java.util.ArrayList;
public class Race {
    private int age;
    private String ageCategory;
    private int size;
    private String sizeCategory; 
    private int abilityScore;
    private String name;
    private int speed;
    private String sub;
    private int hitPoint;
    private String tool;
    private ArrayList <String> abilities = new ArrayList <String> ();


    public String dwarf(String sub, int size, int age, String name, String tool){
        
        //size category
        if (size > 5){
            size = 5;
        }
        else if (size < 4){
            size = 4;
        }
        sizeCategory = "medium";
        
        //age category
        if (age < 0){
            age = 1;
        }
        else if (age < 50){
            ageCategory = "young";
        }
        
        //abilities
        abilities.add("Darkvision");
        abilities.add("Dwarven Resilience");
        abilities.add("Dwarven Combat Training");
        abilities.add("Proficiency with " + tool);
        abilities.add("Read and Write Common");
        abilities.add("Read and Write Dwarvish");

        abilityScore += 2;

        if (sub.equalsIgnoreCase("hill")){
            abilityScore++;
            hitPoint++;
        }
        else if (sub.equalsIgnoreCase("mountain")){
            abilityScore += 2;
            abilities.add("Dwarven Armor Training");
        }

        return "Character Created \nName: " + name + "\nSubrace: " + sub + "\nSize: " + size + "ft. " + sizeCategory + "\nAge: " + age + "years. " + ageCategory + "\nAbility Score: " + abilityScore + "\nSpeed: " + speed + "/nAbilities: " + abilities;
        

    }

}
