import java.util.*;
public class CharCreator{
    private static ArrayList<String> list = new ArrayList<String>();
    private static String name;
    private static String race;
    private static String classDnD;
    private static HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();

    
        public static String Character(String userName, String userRace, String userClassDnD){
        name = userName;
        race = userRace;
        classDnD = userClassDnD;
        list.add(race);
        list.add(classDnD);

        map.put(name, list);

        return map.toString();
        
        





    }
}