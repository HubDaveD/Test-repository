import java.util.Scanner;

/**
 * Filename: Lab3
 * Created by: David Dodds B00830140
 * Created on: 18/01/2021
 * Updated on:
 * Revision no: v1
 * Comment: comment
 **/
public class TestMember

{
   public static Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args)
   {



      //Define a Staff object called staff1

      Staff staff1 = new Staff("George McMullan", "g.mcmullan@ulster.ac.uk", "Lecturer", "F34",30000.00);

      //Define a Staff object called staff2.

      Staff staff2 = new Staff("James Hollinger", "j.hollinger @ulster.ac.uk");

      //The system should prompt the user to enter all 5 staff attributes, then use these to define
      // a Staff object called staff3.

      System.out.println("Enter the details for next staff member ");
      System.out.println("Enter staff member's name: " );
      String staffName  = keyboard.nextLine();
      System.out.print("Enter staff member's email address: ");
      String staffEmail  = keyboard.nextLine();
      System.out.print("Enter staff member's job title: ");
      String staffJobTitle = keyboard.nextLine();
      System.out.print("Enter staff member's office: ");
      String staffRoom  = keyboard.nextLine();
      System.out.print("Enter staff member's Salary: ");
      double staffSalary = keyboard.nextDouble();
      System.out.println("------------\n\n");

      Staff staff3 = new Staff( staffName, staffEmail, staffJobTitle, staffRoom, staffSalary);

      //Print out all the details of each member of staff.
      System.out.println("The Staff records are as follows: ");
      System.out.println(staff1.toString());
      System.out.println(staff2.toString());
      System.out.println(staff3.toString());


      //Print out the number of staff objects created.

      System.out.println("The total number of Staff is: " +Staff.numberOfStaff() +"\n"+
            "==========================================\n");

      //Define a Student object called student1

      Student student1 = new Student("Fred Johnston", "johnston-f1@email.ulster.ac.uk", "Computing", 56, 67, 44 );

      //Define a Student object called student2

      Student student2 = new Student("Jane Robinson", "robinson.j6@email.ulster.ac.uk", "Media Studies");

      //Print out all the details of each student.
      System.out.println("The student records are as follows: \n");
      System.out.println(student1.toString());
      System.out.println(student2.toString());

      //Print out the number of student objects created

      System.out.println("The total number of Students is: " +Student.numberOfStudents() +"\n" +
            "==========================================\n");

     // Provide code that will invoke the instance method
      //called setMarks which will set the marks ofstudent2 to 80, 75 and 77.

      student2.setMarks(80 ,75 ,77);
      System.out.println("Added students marks as 80 ,75 ,77 with setMarks\n");

      //Print out the details of student2.

      System.out.println(student2.toString());

      //Change mark2 of student1 to 76.
      System.out.println("Change mark2 of student1 to 76\n");

      student1.setMark2(76);

      //Print out the details of student1.

      System.out.println(student1.toString());

      //Set the salary of James Hollinger to £45,000.

      System.out.println("Set the salary of James Hollinger to £45,000\n");
      staff2.setSalary(45000);

      //

      System.out.println(staff2.toString());

      //Print out the status of staff3.

      System.out.println("The status of staff 3 is: " + staff3.getStatus());
















   }//main
}//class 
