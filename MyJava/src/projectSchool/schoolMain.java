package projectSchool;

import java.util.Scanner;

public class schoolMain {
    public static void main(String[] args) {
        //you anter n number of students in an array

        //Ask how many students
        System.out.println("How many students need to add?");
        int isStu=0;
         do{ Scanner inStudent = new Scanner(System.in);
            if (inStudent.hasNextInt()) {
                int enterStu = inStudent.nextInt();
                isStu=enterStu;
                break;    /////// handling scanner exceptions with .hasNextInt()
            }else {
                System.out.println("Enter only numbers");
            }
         }while (1!=0);
        schoolMethods[] student = new schoolMethods[isStu];

        //create n number of students
        for(int n = 0; n < isStu; n++){
            student[n] = new schoolMethods();
            student[n].enroll();
            student[n].tuitionPay();
            System.out.println(student[n].showInfo());
        }
    }
}
