import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
        public static HashMap<String, ArrayList> object(String userName, String userRace, String userClassDnD){
            name = userName;
            race = userRace;
            classDnD = userClassDnD;
            list.add(race);
            list.add(classDnD);
    
            map.put(name, list);
            
            HashMap obj = new HashMap(map);
            return map;
        }

        /* 

            
            String filename = "java.ser";
                    // Serialization
        
            try{  
            //Saving of obect in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
             
            // Method for serialization of object
            out.writeObject(object("name", "race", classDnD));
             
            out.close();
            file.close();
             
           return null;
 
        }
         
        catch(IOException ex)
        {
            return null;
        }
 
 
        
 
        // Deserialization
        try
        {  
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
             
            // Method for deserialization of object
            map = (HashMap)in.readObject();
             
            in.close();
            file.close();
             
            return map;
        }
         
        catch(IOException ex)
        {
           return null;
        }
         
        catch(ClassNotFoundException ex)
        {
            return null;
        }
        */
    }
//}



            
        

        





    



