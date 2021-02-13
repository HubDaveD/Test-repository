import java.text.DecimalFormat;

/**
 * Filename: Lab3
 * Created by: David Dodds B00830140
 * Created on: 19/01/2021
 * Updated on:
 * Revision no: v1
 * Comment: comment
 **/
public class TimePiece
{
   public static DecimalFormat df = new DecimalFormat("00");
   private String type;
   private double costPrice;
   private String readOut;
   private int hours;
   private int minutes;
   private int seconds;
   private boolean canTalk = false; // default


   public TimePiece(){
   }//Default constructor

   public TimePiece(String clockType,double clockCoastPrice, String clockReadOut, int clockHours, int clockMinutes, int clockSeconds, boolean clockCanTalk){
      type = clockType;
      costPrice = clockCoastPrice;
      readOut = clockReadOut;
      hours = clockHours;
      minutes = clockMinutes;
      seconds = clockSeconds;
      canTalk = clockCanTalk;
   }//TimePiece constructor

   public TimePiece(String clockType,double clockCoastPrice, String clockReadOut, boolean clockCanTalk){
      type = clockType;
      costPrice = clockCoastPrice;
      readOut = clockReadOut;
      canTalk = clockCanTalk;
      hours = -1;
      minutes = -1;
      seconds = -1;
   }//TimePiece constructor

   //all the gets

   private String getType(){
      return type;
   }//getType

   private double getCostPrice(){
      return costPrice;
   }//getCostPrice

   private String getReadOut(){
      return readOut;
   }//getType

   private boolean getCanTalk(){
      return canTalk;
   }//getType

   private int getHours(){
      return hours;
   }//getHours

   private int getMinutes(){
      return minutes;
   }//getMinutes

   private int getSeconds(){
      return seconds;
   }//getSeconds

   //all the sets

   protected void setType(String requiredType){
      type = requiredType;
   }//setType

   protected void setCostPrice(double requiredCostPrice){
      costPrice = requiredCostPrice;
   }//setCostPrice

   protected void setReadOut(String requiredReadOut){
      readOut = requiredReadOut;
   }//setReadOut

   protected void setHours(int requiredHours){
      hours = requiredHours;
   }//setHours

   protected void setMinutes(int requiredMinutes){
      minutes = requiredMinutes;
   }//setMinutes

   protected void setSeconds(int requiredSeconds){
      seconds = requiredSeconds;
   }//setSeconds

   protected void setCanTalk(boolean requiredCanTalk){
      canTalk = requiredCanTalk;
   }//setSeconds

   //give the time
   private void showTime(){
      System.out.println(df.format(getHours()) + ":" + df.format(getMinutes()+ "\n"));
   }//showTime

   public String toString(){

      if (getCanTalk()==true){
            return
            ("Details of clock" +
            "==============================" +
            "Cost Price:\t \t" + getCostPrice() + "\n" +
            "Type of read out:\t" + getType() +  "\n" +
            "Current Time:\t \t" + /*showTime()*/  "\n" +
                  "This time piece can talk" + "\n" +
                  "==============================");
            }//if
      else{
         return
         ("Details of clock" +
               "==============================" +
               "Cost Price:\t \t" + getCostPrice() + "\n" +
               "Type of read out:\t" + getType() +  "\n" +
               "Current Time:\t \t" + /*showTime()*/  "\n" +
               "This time piece cannot talk" + "\n" +
               "==============================");

      }

   }



}//class 
