import java.io.*;
import java.util.*;



public class CharCreator implements Serializable {
    private ArrayList<String> list = new ArrayList<String>();
    private String name;
    private String race;
    private String classDnD;
    private static HashMap<String, ArrayList> map = initializeMap();
    private static String fileName = "characters.ser";

    public void addCharacter(String userName, String userRace, String userClassDnD) {
        name = userName;
        race = userRace;
        classDnD = userClassDnD;
        list.add(race);
        list.add(classDnD);
        map.put(name, list);
        CharacterList newList = new CharacterList(map);
    }

    public String getMapString() {
        // String returnString = "\n";

        return map.toString();

        // returnString += name;
        // for (int i = 0; i < map.size(); i++) {
        // returnString += "\t" + map.get(name).get(i) + "\n";
        // }
    }

    // return returnString + " " + map.toString();

    public static HashMap<String, ArrayList> getMap() {
        return map;
    }

    public boolean save() {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(map);
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
        HashMap<String, ArrayList> retrivedMap = new HashMap<String, ArrayList>();
        retrivedMap = null;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            retrivedMap = (HashMap<String, ArrayList>) ois.readObject();
            ois.close();
            fis.close();

            return retrivedMap;
        } catch (Exception e) {
            return null;
        }
    }

    public static HashMap<String, ArrayList> initializeMap() {
        if (map == null) {
            map = restore();
            if (map == null) {
                map = new HashMap<String, ArrayList>();
            }
        }
        return map;
    }
}
