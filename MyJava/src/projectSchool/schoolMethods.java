package projectSchool;

import java.util.Scanner;

public class schoolMethods {
    public static String fistName;
    public static String lastName;
    public int stuYear = 0;
    public int stuID = 100;
    public String stuCourse = "";
    public double tuitionBalance = 0;
    public double costOfCourse = 600;


    public schoolMethods(){
        System.out.println("Enter Name: ");     //Enter name
        Scanner in = new Scanner(System.in);
        fistName = in.nextLine();

        System.out.println("Enter Last: ");     //Enter Last name
        Scanner in2 = new Scanner(System.in);
        lastName = in2.nextLine();

        System.out.println("What year are you?"+"\n1-Fist\n2-Second\n3-Third");     //year of student
        Scanner year = new Scanner(System.in);
        stuYear = year.nextInt();

        setStudentID();

    }
    public void setStudentID(){
        stuID++;
        stuID = stuYear + stuID;
    }
    public void enroll(){
        do {
            System.out.println("Enter course to enroll, Q to quit");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
                if (!(course.equals("q") || (course.equals("Q")))) {
                    stuCourse = stuCourse +"\n "+ course;
                    tuitionBalance = tuitionBalance + costOfCourse;
                } else {break;}
        } while (1 != 0);
    }
    public void vieuBalance(){
        System.out.println("Your tuition balance is: $"+ tuitionBalance);
    }
    public void tuitionPay(){
        vieuBalance();
        System.out.print("Enter your payment: $ ");
        Scanner input =new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment.");
        vieuBalance();
    }
    public String showInfo(){
        return "Name "+ fistName+" "+lastName+
                "\nGrade Level "+stuYear+", your ID number is: "+stuID+
                "\nCourses enrolled "+stuCourse+
                "\nBalance $"+tuitionBalance;
    }


}
