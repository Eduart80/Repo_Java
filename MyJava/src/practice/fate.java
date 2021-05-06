package practice;

import java.util.Random;

public class fate {

    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(fate.length);
        System.out.println(fate[r]);
    }

    public static String[] fate = {"Today is a nice day",
            "Look for people around you",
            "He is a good candidate",
            "A beautiful, smart, and loving person will be coming into your life.",
            "A faithful friend is a strong defense.",
            "A feather in the hand is better than a bird in the air",
            "A fresh start will put you on your way.",
            "A golden egg of opportunity falls into your lap this month.",
            "A hunch is creativity trying to tell you something.",
            "Advice is like kissing. It costs nothing and is a pleasant thing to do.",
            "All the effort you are making will ultimately pay off.",
            "An inch of time is an inch of gold.",
            "Believe in yourself and others will too.",
            "Carve your name on your heart and not on marble.",
            "Curiosity kills boredom. Nothing can kill curiosity.",
            "Don’t let friends impose on you, work calmly and silently.",
            "Don’t just think, act!",
            "Every flower blooms in its own sweet time.",
            "Every flower is unique."
    };
}
