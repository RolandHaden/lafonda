/*
Author: Davis Haden
Date Created: 1/21/2021
Date Last Modified: 2/4/2021
Desc: This class defines food items in the menu, and details that it provides include: 
Name, Price, Description of Item, and the subcategory of the menu. A toString method was not used as it was
causing the issues with my code.
*/
public class Food{
   private String name;
   private double price;
   private String desc;
   private String type;
   private String side = "no sides";
   //Constructor 
   public Food(String n, double p, String d, String t){
      name = n;
      price = p;
      desc = d;
      type = t;
   }
   //Returns the name of the item
   public String getName(){
      return name;
   }
   //Returns the price of the item
   public double getPrice(){
      return price;
   }
   //Return the description of the item
   public String getDesc(){
      return desc;
   }
   //Return the type of the item.
   public String getType(){
      return type;
   }
   public String getSide(){
      return side;//I did not use this side type
   }
   //Sets the side, not utilized in the code, but I kept it in case
   public void setSide(String s){
      side = s;
   }
   //Updates the price
   public void setAP(double s){
      price = s + price;
   }
 }