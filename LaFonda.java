/*
Author: Davis Haden
Date Created: 1/21/2021
Date Last Modified: 2/4/2021
Desc: A program that a resturant could use to take orders and get a total price.
*/
import java.util.*;
public class LaFonda{
   public static void main(String[] args){
      System.out.println("▄▄▌   ▄▄▄·     ·▄▄▄       ▐ ▄ ·▄▄▄▄   ▄▄▄·\n██•  ▐█ ▀█     ▐▄▄·▪     •█▌▐███▪ ██ ▐█ ▀█\n██▪  ▄█▀▀█     ██▪  ▄█▀▄ ▐█▐▐▌▐█· ▐█▌▄█▀▀█\n▐█▌▐▌▐█ ▪▐▌    ██▌.▐█▌.▐▌██▐█▌██. ██ ▐█ ▪▐▌\n.▀▀▀  ▀  ▀     ▀▀▀  ▀█▄▀▪▀▀ █▪▀▀▀▀▀•  ▀  ▀");
      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.print("Welcome to La Fonda! ");
      //this allows the program to say hello with out repeating when running the menu class
      Menu.startMenu();
   }
}