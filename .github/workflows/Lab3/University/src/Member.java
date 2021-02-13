
/**
 * Filename: Lab3
 * Created by: David Dodds B00830140
 * Created on: 18/01/2021
 * Updated on:
 * Revision no: v1
 * Comment: The super class definition of Member class
 **/
abstract public class Member
{
   private String name;
   private String email;

   public Member(){
      //default constructor
   }//member

   public Member(String memberName,String memberEmail){
       name = memberName;
       email = memberEmail;
   }//user defined constructor

   //Member member1 = new Member(); creation of member object default constructor

   //Member member1 = new Member("john, "j@ulster.ac.uk"); creation of member object default constructor

   public String toString(){
      return "Name:" + name + "\n" +
            "Email: " + email + "\n";
   }//toString

   abstract protected String getStatus();
   //as abstract no implementation

   // make the sets
   protected void setName(String memberName){
      name = memberName;
   }//set name

   protected void setEmail(String memberEmail){
      email = memberEmail;
   }//setEmail

   /*protected void setStatus(String memberStatus){
      status = memberStatus;
   }//setStatus*/

   private String getName(){
      return name;
   }//getName

   private String getEmail(){
      return email;
   }//getEmail

   /*private String getStatus(){
      return status;
   }//getStatus*/



}//class 
