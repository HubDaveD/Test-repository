import java.text.DecimalFormat;

/**
 * Filename: Lab3
 * Created by: David Dodds B00830140
 * Created on: 18/01/2021
 * Updated on:
 * Revision no: v1
 * Comment: Student class definitions
 **/
public class Student extends Member
{

   public static DecimalFormat df = new DecimalFormat("0.00");
   private String course;
   private int mark1;
   private int mark2;
   private int mark3;
   private int studentID;
   private static int studentsTotal = 0;


   public  Student(){
      super();
   }//default constructor

   public  Student(String StudentName, String StudentEmail, String StudentCourse, int StudentMark1, int StudentMark2,int StudentMark3){
      super(StudentName,StudentEmail);
      studentID = studentsTotal + 1;
      course = StudentCourse;
      mark1 = StudentMark1;
      mark2 = StudentMark2;
      mark3 =StudentMark3;
      studentsTotal++;
   }//default constructor

   public  Student(String StudentName, String StudentEmail, String StudentCourse ){
      super(StudentName,StudentEmail);
      course = StudentCourse;
      mark1 = -1;
      mark2 = -1;
      mark3 = -1;
      studentID = studentsTotal + 1;
      studentsTotal++;
   }//default constructor

   // the abtract method completion
   protected String getStatus(){
      return "Student";
   }


   // the Gets
   private String getCourse (){
      return course;
   }//getCourse

   protected int getID(){
      return studentID;
   }//getID

   protected void setCourse(String studentCourse){
      course = studentCourse;
   }//setCourse

//Mark 1
   private int getMark1 (){
      return mark1;
   }//getMark1

   protected void setMark1(int studentMark1){
      mark1 = studentMark1;
   }//setMark1

   // Mark 2
   private int getMark2 (){
      return mark2;
   }//getMark2

   protected void setMark2(int studentMark2){
      mark2 = studentMark2;
   }//setMark2

   // Mark 3
   private int getMark3 (){
      return mark3;
   }//getMark3

   protected void setMark3(int studentMark3){
      mark3 = studentMark3;
   }//setMark3

   protected void setMarks(int studentMark1, int studentMark2, int studentMark3){
      mark1 = studentMark1;
      mark2 = studentMark2;
      mark3 = studentMark3;
   }//setMarks

   private double getAverage(){
      return (mark1 + mark2 + mark3)/3;
   }//get Average


   public static int numberOfStudents(){
      return studentsTotal;
   }//return the num of students

   public String toString(){

      if(mark1==-1|mark2==-1|mark3==-1 ){
         return
               (super.toString() +
                     "No valid marks are recorded for this student student\n" +
                     "==========================================\n");
      }//if
      else{
            return
                  ("The Student ID: " + studentID + "\n" +
                        super.toString() +
                        "Course: " + course + "\n" +
                        "The student's three marks are:\n" +
                        "\t" + mark1 + "%\n" +
                        "\t" + mark2 + "%\n" +
                        "\t" + mark3 + "%\n" +
                        "The average mark of the student is " + df.format(getAverage()) + "\n" +
                        "==========================================\n");
         }//else
   }//toString









   // the Sets

}//class 
