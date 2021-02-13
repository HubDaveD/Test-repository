import java.text.DecimalFormat;

/**
 * Filename: Lab3
 * Created by: David Dodds B00830140
 * Created on: 18/01/2021
 * Updated on:
 * Revision no: v1
 * Comment: Staff class definitions
 **/
public class Staff extends Member
{

   public static DecimalFormat df = new DecimalFormat("0,000.00");
   private String jobTitle;
   private String room;
   private double salary;
   private int staffNumber = 100000;
   private static int totalNoOfStaff = 0;


   public Staff(){
      super();
   }//default constructor

   public  Staff(String staffName, String staffEmail, String staffJobTitle, String staffRoom,double staffSalary) {
      super(staffName, staffEmail);
      //staff =staffName;
      //email = staffEmail;
      jobTitle = staffJobTitle;
      room = staffRoom;
      salary = staffSalary;
      totalNoOfStaff++;
      staffNumber += totalNoOfStaff;
   }// constructor

   //Staff staff1 = new Staff(); //creation of staff object via the constructor two parameters fot the name and the email address

   public Staff (String staffName, String staffEmail)
   {
      super(staffName, staffEmail);

      jobTitle = "  ";
      room = "  ";
      salary = 0;
      totalNoOfStaff++;
      staffNumber += totalNoOfStaff;
   }//constructor 2

   // the abtract method completion
   protected String getStatus(){
      return "Staff";
   }//get string

   protected int getID(){
      return staffNumber;
   }//getID

   protected void setJobTitle(String staffJobTitle){
      jobTitle = staffJobTitle;
   }//setJobTitle

   private String getJobTitle(){
      return jobTitle;
   }//getJobTitle

   protected void setRoom(String staffRoom){
      room = staffRoom;
   }//setRoom

   private String getRoom(){
      return room;
   }//getRoom

   protected void setSalary(int staffSalary){
      salary = staffSalary;
   }//setSalary

   private double getSalary(){
      return salary;
   }//getSalary



   public static int numberOfStaff(){
   return totalNoOfStaff;
   }//return the num of staff

   public String toString(){
      return ("The Staff ID is: " + staffNumber + "\n" +
            super.toString() +
            "Job Title: " + jobTitle + "\n" +
            "Room: " + room + "\n" +
            "Salary:  £" + df.format(salary) + "\n" +
            "==========================================\n");
   }//toString

}//class 
