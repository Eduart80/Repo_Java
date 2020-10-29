package group_4_Project;

import java.util.Scanner;

public class requestAShop {

    public void toOpenShop() {
        System.out.println("A person ask to open a shop in your Mall.");
        System.out.println("Do you want to approve? (Y) for Yes, (N) for No");
        Scanner in = new Scanner(System.in);
        char Y = in.next().charAt(0);
        if (Y == 'y') {
            //enter in shop
            shopOwner_1 a1 = new shopOwner_1();
            a1.askRequest("Jonathan", "Bravo", "Seiko", true);
            a1.checkCondition();
            a1.information();
        } else {
            System.out.println("\nMaybe next time. Sorry");
        }
    }
}
