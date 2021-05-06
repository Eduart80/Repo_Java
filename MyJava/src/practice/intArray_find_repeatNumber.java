package practice;

public class intArray_find_repeatNumber {
    public static void main(String[] args) {
        int[] arrA = {1,2,2,2,3,4,5,6,7};

        String[] name = {"happy", "peace", "joy", "grow", "peace", "happy", "peace", "grow"};

        MaxRepeatingElement(arrA);
        MaxRepeatingElement(name);
    }

    public static void MaxRepeatingElement(int[] arrA) {
        int maxCounter = 0;
        int element = 0;
        for (int i = 0; i < arrA.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] == arrA[j]) {
                    counter++;
                }
            }
            if (maxCounter < counter) {
                maxCounter = counter;
                element = arrA[i];
            }
        }
        System.out.println("Element: " + element + ", repeat maximum count of: " + maxCounter);
    }
    public static void MaxRepeatingElement(String[] arrA) {
        int maxCounter = 0;
        String element = "";
        for (int i = 0; i < arrA.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] == arrA[j]) {
                    counter++;
                }
            }
            if (maxCounter < counter) {
                maxCounter = counter;
                element = arrA[i];
            }
        }
        System.out.println("Element: " + element + ", repeat maximum count of: " + maxCounter);
    }
}


