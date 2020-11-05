package labs;

public class countString_howMany {

///////////////////////////////////////////////////
//    Find how many string words have the same value

    public static void main(String[] args) {
        String[] have = {"happy", "peace", "joy", "grow", "peace", "happy", "grow","peace", "grow","bon"};
        findIn(have);
    }


    public static void findIn(String[] name) {

        for (int i = 0; i < name.length; i++) {
            int count = 0;
            for (int j = 0; j < name.length; j++) {
                if (j < i && name[i] == name[j]) {
                    break;
                }
                if (name[i] == name[j]) {
                    count++;
                }
                if (j == name.length - 1) {
                    System.out.println("Found " + name[i] + " is equal " + count + " times.");
                }
            }
        }
    }

}


