import java.util.*;

public class CharacterList{
    public static HashMap<String, ArrayList> characters;
    
    public CharacterList(HashMap<String, ArrayList> characters){
        this.characters = characters;
    }

    public HashMap<String, ArrayList> getCharacters(){
        return characters;
    }

    public void addCharacterEntry(String name, ArrayList characterInfo){
        characters.put(name, characterInfo);
    }

    public boolean no(){
        return false;
    }


}