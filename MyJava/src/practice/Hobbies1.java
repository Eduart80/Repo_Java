package practice;
import java.util.*;

public class Hobbies1 {

    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }


    public List<String> findAllHobbyists(String hobby) {
        List<String> hobbyists = new ArrayList<>();
       for (int i = 0; i < hobby.length(); i++) {
           hobbyists.get(i);
       }
        return hobbyists;
    }


    public static void main(String[] args) {
        Hobbies1 hobbies = new Hobbies1();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic", "Pets");
        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");

        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
    }
}
class Hobbies2 {
    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    //Implement method that returns a list of names of people with the selected hobby in any order
    public List<String> findAllHobbyists(String hobby) {
        LinkedList<String> finalList = new LinkedList<>();

        Set<Map.Entry<String, String[]>> entries = hobbies.entrySet();
        for (Map.Entry<String, String[]> entry : entries) {
            if (isPresent(entry.getValue(), hobby))
                finalList.add(entry.getKey());
        }
        return finalList;
    }

    private boolean isPresent(String[] array, String value) {
        for (String s : array) {
            if (s.equals(value))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Hobbies2 hobbies = new Hobbies2();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic", "Pets");
        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");


        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Yoga").toArray()));
    }
}