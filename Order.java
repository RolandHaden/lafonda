/*
Author: Davis Haden
Date Created: 1/21/2021
Date Last Modified: 2/4/2021
Desc: This class takes the orders for the program and puts it into a string. It also takes the order for sides and calculates the new price.
*/
import java.util.*;
public class Order{
   private int numPeople = 0;
   static ArrayList<Food> orderArray = new ArrayList<Food>();
   //static ArrayList<String> customers = new ArrayList<String>();
   private static ArrayList<Food> menuArray = Menu.menuArray;
   private String name;
   static String receipt = "";
   private static boolean sideLoop = true;
   private static int j = 0;
   static double totalPrice = 0;
   //This method takes orders from the menu and depending on the type of item, will ask for if the user wants a side and will add it to their order
   //the only menu items that are not included with sides are drinks and the sides themselves
   public static void takeOrder(String u){
      Scanner input = new Scanner(System.in);
      String userInput = u;
      String replyInput;
      String orderInput;
      System.out.print("Would you like to add this to your order? (YES/NO) ");
      replyInput = input.nextLine();
      if(replyInput.equalsIgnoreCase("yes")){
         for(int i = 0; i < menuArray.size(); i++){
            if(userInput.equalsIgnoreCase(menuArray.get(i).getName()) && (menuArray.get(i).getType().equalsIgnoreCase("BEBIDAS") == false) && (menuArray.get(i).getType().equalsIgnoreCase("SIDE") == false)){
               orderArray.add(menuArray.get(i));
               System.out.println("~~~~~~~~~~~~~~");
               System.out.print("Would you like to add a side? (YES/NO) ");
               replyInput = input.nextLine();
               sideLoop = true;
               if(replyInput.equalsIgnoreCase("yes")){
                  while(sideLoop == true){
                     System.out.println("~~~~~~~~~~~~~~");
                     System.out.print("What would you like for your side?: ");
                     userInput = "";
                     userInput = input.nextLine();
                     for(j = 0; j < menuArray.size(); j++){
                     //System.out.println(userInput);
                        if(userInput.equalsIgnoreCase(menuArray.get(j).getName()) && menuArray.get(j).getType().equalsIgnoreCase("SIDE")){
                           //System.out.println("Your Item was Found");
                           //Menu.menuArray.get(j).setSide(menuArray.get(j).getName());
                           //Menu.menuArray.get(j).setPrice(menuArray.get(j).getPrice());
                           System.out.println("~~~~~~~~~~~~~~");
                           System.out.println("Added to your order!");
                           receipt = receipt + menuArray.get(i).getName() + " with " + menuArray.get(j).getName() + " -- $" + (menuArray.get(i).getPrice() + menuArray.get(j).getPrice())  + "\n";
                           totalPrice += menuArray.get(i).getPrice() + menuArray.get(j).getPrice();
                           sideLoop = false;
                           userInput = "";
                           break;
                        }else if (j == (menuArray.size() - 1) && userInput.equalsIgnoreCase("no")){
                           Menu.menuArray.get(j).setSide("no sides");
                           System.out.println("~~~~~~~~~~~~~~");
                           System.out.println("No sides were added to the order!");
                           receipt = receipt + menuArray.get(i).getName() + " with no sides" + " -- $" + menuArray.get(i).getPrice() + "\n";
                           totalPrice += menuArray.get(i).getPrice();
                           sideLoop = false;
                           break;
                        }else if (j == (menuArray.size() - 1)){
                           System.out.println("~~~~~~~~~~~~~~");
                           System.out.println("Sorry! That item either does not exist or is not a side, if you do not want a side please input \"no\".");
                        }
                     }
                  }
               }else if (replyInput.equalsIgnoreCase("no")){
                  Menu.menuArray.get(i).setSide("no sides");
                  System.out.println("~~~~~~~~~~~~~~");
                  System.out.println("No sides were added to the order!");
                  receipt = receipt + menuArray.get(i).getName() + " with no sides" + " -- $" + menuArray.get(i).getPrice() + "\n";
                  totalPrice += menuArray.get(i).getPrice();
                  sideLoop = false;
               }else{
                  System.out.println("~~~~~~~~~~~~~~");
                  System.out.println("Sorry I did not get that, please try again.");
                  orderArray.remove(orderArray.size()-1);
               }
            }else if(userInput.equalsIgnoreCase(menuArray.get(i).getName()) && (menuArray.get(i).getType().equalsIgnoreCase("BEBIDAS") || (menuArray.get(i).getType().equalsIgnoreCase("SIDE")))){
               receipt = receipt + menuArray.get(i).getName() + " -- $" + menuArray.get(i).getPrice() + "\n";
               totalPrice += menuArray.get(i).getPrice();
            }
         }
      }else if (replyInput.equalsIgnoreCase("no")){
         
      }else{
         System.out.println("~~~~~~~~~~~~~~");
         System.out.println("Sorry Invalid Response!");
      }
   }
}