import java.io.*;
import java.util.*;

public class CharCreator implements Serializable {
    private static ArrayList<String> list = new ArrayList<String>();
    private static String name;
    private static String race;
    private static String classDnD;
    private static CharacterList map = new CharacterList(initializeMap());
    private static String fileName = "characters.ser";

    public static void addCharacter(String userName, String userRace, String userClassDnD) {
        name = userName;
        race = userRace;
        classDnD = userClassDnD;
        list.add(race);
        list.add(classDnD);
        map.addCharacterEntry(name, list);
    }

    public static String getMapString() {
        String returnString = "\n";
        for (String name : map.getCharacters().keySet()) {
            returnString += name;
            for (int i = 0; i < map.(name).size(); i++) {
                returnString += "\t" + map.get(name).get(i) + "\n";
            }
        }

        return returnString + "     " + map.toString();
    }

    public static HashMap<String, ArrayList> getMap() {
        return map;
    }

    public boolean save() {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this);
            oos.close();
            fos.close();
            return true;
        }

        catch (IOException e) {
            System.err.println(e);
            return false;
        }

    }

    public static HashMap<String, ArrayList> restore() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            HashMap<String, ArrayList> retrivedMap = (HashMap<String, ArrayList>) ois.readObject();
            ois.close();
            fis.close();

            return retrivedMap;
        } catch (Exception e) {
            return null;
        }
    }

    private static HashMap<String, ArrayList> initializeMap() {
        if (map == null) {
            map = restore();
            if (map == null) {
                map = new HashMap<String, ArrayList>();
            }
        }
        return map;
    }
}
