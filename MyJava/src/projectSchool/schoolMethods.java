package projectSchool;

import java.util.Scanner;

public class schoolMethods {
    private String fistName;
    private String lastName;
    private int stuCourse;
    private int stuID = 100;
    private double stuTuition = 600;
    private double stuBalance = 0;
    private int stuYear = 0;

    public schoolMethods(){
        System.out.println("Enter Name: ");     //Enter name
        Scanner in = new Scanner(System.in);
        this.fistName = in.nextLine();

        System.out.println("Enter Last: ");     //Enter Last name
        Scanner in2 = new Scanner(System.in);
        this.lastName = in2.nextLine();

        System.out.println("What year are you?"+"\n1-Fist\n2-Second\n3-Third");     //year of student
        Scanner year = new Scanner(System.in);
        this.stuYear = year.nextInt();

        System.out.println("Chose your courses");     //Enter course
        Scanner cours = new Scanner(System.in);
        this.stuCourse = cours.nextInt();

        setStudentID();
        System.out.println("You chose "+stuCourse+"\nTuition "+stuBalance);

    }
    public void setStudentID(){
        stuID++;
        System.out.println(stuID+stuYear);

    }


}
