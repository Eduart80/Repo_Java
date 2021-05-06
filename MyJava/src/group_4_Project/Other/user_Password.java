package group_4_Project.Other;

import java.util.Scanner;

public class user_Password {

    public static void main(String[] args) {
        methods a1 = new methods();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String inpUser = userInput.nextLine();
        Scanner userPass = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String inpPass = userPass.nextLine(); // gets input from user
        if (inpUser.equals("jon") && inpPass.equals("123")){
            System.out.println("Access Granted! Welcome!"); //Access Granted! Welcome!
        }else
            System.out.println("Invalid Username & Password!");
        if (inpUser.equals("jon")){
            System.out.println("Access Granted! Welcome!"); //Access Granted! Welcome!
        }
           // System.out.println("Invalid Username & Password!");
    }

}
