/*
Author: Davis Haden
Date Created: 1/21/2021
Date Last Modified: 2/5/2021
Desc: This class is used to control all of the items in the menu. It defines Food class objects and makes the entries for the main menu.
This class also calculates the receipt.
*/

import java.util.*;
public class Menu{
   static ArrayList<Food> menuArray = new ArrayList<Food>();
   String itemName;
   double itemPrice;
   String itemDesc;
   public Menu(){
   }
   //This method creates all of the food objects for the whole menu. This method ends around line 165.
   public static void generateMenu(){ 
      //Aperitivos, Ensaladas Y Sopas
      Food Tostones = new Food("Tostones", 3.25, "Fried plantain chips served with garlic dipping sauce.", "AES");
      menuArray.add(Tostones);
      Food Queso = new Food("Queso", 3.95, "Mildly spicy white cheese dip served warm, available with or without jalapenos.", "AES");
      menuArray.add(Queso);
      Food GPMS = new Food("GPMS", 9.25, "(Grilled Pork and Mango Salad) Tender strips of fresh pork, marinated in a mango vinaigrette, \ngrilled with fresh mango, red and green peppers, tomatoes and red onions served over \na bed of mixed field greens, with a creamy mango vinaigrette.", "AES");
      menuArray.add(GPMS);
      Food AD = new Food("Artichoke Dip", 3.95, "A creamy dip of chopped artichokes, olives, pimentos and \ngarlic, served warm (chips and Salsa included with any \nentree or sold separately).", "AES");
      menuArray.add(AD);
      Food RAB = new Food("Arroz con Frijoles", 4.50, "Yellow rice and black beans.", "AES");
      menuArray.add(RAB);
      Food GD = new Food("Guacamole Dip", 5.95, "Fresh chopped avocados, tomatoes, onions, jalapenos and lime juice.", "AES");
      menuArray.add(GD);
      Food ELA = new Food("Ensalada Andes", 9.75, " (Ensalada de los Andes) A spinach and iceberg salad topped with fresh tomatoes, red onions, cilantro, jalapenos and warm black beans with a creamy Cuban dressing.", "AES");
      menuArray.add(ELA);
      Food EP = new Food("Ensalada con Pollo", 9.75, "Grilled boneless breast of chicken over mixed greens, fresh tomatoes, cucumbers, onions, bell peppers and tortilla chips, with vinaigrette dressing.", "AES");
      menuArray.add(EP);
      Food EC = new Food("Ensalada de Casa", 5.95, "House salad with fresh cucumbers, tomatoes, lettuce, onions, black olives and bell peppers with vinaigrette dressing.", "AES");
      menuArray.add(EC);
      Food PG = new Food("Platos Grandes", 9.50, "Chips served with salsa, artichoke dip, Queso La Fonda, guacamole and sour cream.", "AES");
      menuArray.add(PG);
      Food Maduros = new Food("Maduros", 3.25, "Traditional, fried sweet plantains.", "AES");
      menuArray.add(Maduros);
      Food SP = new Food("Sopa de Pollo", 4.75, "Chicken soup with rice, tomatoes, green onions and cilantro, served with jalapenos and lime on the side.", "AES");
      menuArray.add(SP);
      //Tradicion De Espana Our House Specialty
      Food ACPE = new Food("Arroz Con Pollo", 13.50, "(Arroz Con Pollo Espana) A half chicken cooked with yellow rice, white wine, paprika, tomatoes, onions, peppers, pimentos and cilantro.", "HS");
      menuArray.add(ACPE);
      Food PME = new Food("Paella del Mar Espana", 12.75, "Yellow rice cooked with shrimp, calamari, salmon, sea scallops, mussels, green peppers, onions, pimentos and clam juice.", "HS");
      menuArray.add(PME);
      Food PV = new Food("Paella con Verduras", 9.50, "Yellow rice cooked with eggplant, artichoke hearts, peas, squash, mushrooms, black olives, onions and peppers, seasoned with curry.", "HS");
      menuArray.add(PV);
      Food PE = new Food("Paella Espana", 13.69, "Yellow rice cooked in a cast-iron skillet with calamari, shrimp, baked chicken, chorizo (Spanish sausage), green peppers, onions, pimentos and clam juice.", "HS");
      menuArray.add(PE);
      //De La Parrilla Cubana
      Food BLP = new Food("Bistec a la Parilla", 15.50, "A marinated seasoned ribeye steak with tomato criolla sauce on the side.", "DLPC");
      menuArray.add(BLP);
      Food VLP = new Food("Verduras a la Parilla", 8.75, "Grilled vegetable kabobs with squash, mushrooms, potatoes, tomatoes, green peppers and onions.", "DLPC");
      menuArray.add(VLP);
      Food CCLP = new Food("Chuletas de Cerdo a la Parrilla", 11.75, "2 center-cut pork chops with tomato Criolla sauce on the side.", "DLPC");
      menuArray.add(CCLP);
      Food PLP = new Food("Polla a la Parilla", 11.95, "A half chicken, marinated in mojo and glazed.", "DLPC");
      menuArray.add(PLP);
      //Bocadillos Cubanos
      Food BL = new Food("Bocadillo Latino", 10.54, "Roast pork, ham, Swiss cheese, mustard, mayonnaise, mojo sauce and pickles on Cuban bread.", "BC");
      menuArray.add(BL);
      Food BC = new Food("Bocadillo con Chorizo", 10.25, "Sauteed smoked Spanish sausage, roasted red peppers, tomatoes, onions, Monterey jack cheese, Cuban dressing and brown mustard on Cuban bread.", "BC");
      menuArray.add(BC);
      Food RC = new Food("Reuben Cubano", 10.50, "Grilled boneless breast of chicken, Swiss cheese, Cuban coleslaw, pickles and Cuban dressing on Cuban bread.", "BC");
      menuArray.add(RC);
      Food BV = new Food("Bocadillo Vegetariano", 8.95, "Grilled vegetables, tomatoes, cheddar, Monterey jack cheeseand Cuban dressing on Cuban bread.", "BC");
      menuArray.add(BV);
      Food BB = new Food("Bocadillo con Bistec", 10.75, "Strips of marinated Angus beef, Monterey jack cheese, onions, peppers, onions, tomatoes and Cuban dressing on Cuban bread.", "BC");
      menuArray.add(BB);
      //Un Sabor Mexicano
      Food CBPE = new Food("Chicken, Beef or Pork Enchiladas", 11.50, "White corn tortillas filled with seasoned chicken cooked in tomatoes and onions or shredded beef or smoked pulled pork and topped with a \nchipotle ancho chili pepper tomato sauce, cheddar and Monterey Jack cheese, queso blanco and cilantro.", "SM");
      menuArray.add(CBPE);
      Food CVQ = new Food("Con Verudas Quesadilla", 9.50, "Served with cheese and assorted grilled vegetables.", "SM");
      menuArray.add(CVQ);
      Food CHQ = new Food("Con Hongos Quesadilla", 9.50, "Served with cheese and seasoned, grilled fresh mushrooms.", "SM");
      menuArray.add(CHQ);
      Food VB = new Food("Veggie Burrito", 8.50, "Grilled squash, mushrooms, broccoli, onions, peppers, pimentos and artichoke hearts with a fresh spinach, lettuce, tomatoes, \ncheddar and a Monterey jack cheese, with a mojo-mustard dressing, rolled in a warm flour tortilla.", "SM");
      menuArray.add(VB);
      Food CBQ = new Food("Con Bistec Quesadilla", 10.50, "Served with cheese, strips of Angus beef, sour cream, onions and peppers.", "SM");
      menuArray.add(CBQ);
      Food CPQ = new Food("Con Pollo Quesadilla", 10.75, "Served with cheese and chicken cooked in tomatoes and onions.", "SM");
      menuArray.add(CPQ);
      Food CFQ = new Food("Con Frijoles Quesadilla", 8.50, "Served with cheese, black beans and sour cream.", "SM");
      menuArray.add(CFQ);
      Food SB = new Food("Shrimp Burrito", 10.75, "Grilled fresh shrimp, lettuce, tomatoes, onions and a sour cream-jalapeno sauce, rolled in a large warm flour tortilla.", "SM");
      menuArray.add(SB);
      Food CE = new Food("Cheese Enchiladas", 8.70, "White corn tortillas filled with melted cheddar and Monterey Jack cheese, covered with a chipotle \nand ancho chili pepper tomato sauce, topped with cheddar and Monterey Jack cheese, queso blanco and cilantro.", "SM");
      menuArray.add(CE);
      Food CCQ = new Food("Con Cerdo Quesadilla", 10.50, "Served with cheese and smoked pulled pork, grilled onion, peppers and sour cream.", "SM");
      menuArray.add(CCQ);
      Food CEQ = new Food("Con Espinaca Quesadilla", 9.50, "Served with cheese, fresh spinach and red onions.", "SM");
      menuArray.add(CEQ);
      Food CMJQ = new Food("Con Maiz y Jalapenos Quesadilla", 8.75, "Served with cheese, corn, jalapenos, sour cream and green onion.", "SM");
      menuArray.add(CMJQ);
      Food FB = new Food("Fish Burrito", 8.95, "Marinated, grilled salmon or tilapia and grilled corn, with lettuce, tomatoes, onions and a sour cream-jalapeno sauce rolled in a warm flour tortilla.", "SM");
      menuArray.add(FB);
      Food CQQ = new Food("Con Queso Quesadilla", 8.75, "Served with cheese only.", "SM");
      menuArray.add(CQQ);
      Food CCOQ = new Food("Con Chorizo Quesadilla", 10.25, "Served with cheese, Spanish sausage, roasted red peppers and onions.", "SM");
      menuArray.add(CCOQ);
      Food CCAQ = new Food("Con Camarones Quesadilla", 10.25, "Served with cheese and sauteed fresh shrimp.", "SM");
      menuArray.add(CCAQ);
      Food VT = new Food("Veggie Tacos", 10.95, "2 soft tacos filled with grilled squash, mushrooms, broccoli, onions, peppers and pimentos, \nwith fresh spinach, lettuce, tomatoes, cheddar and Monterey jack cheese and a mojo-mustard dressing.", "SM");
      menuArray.add(VT);
      Food CBPB = new Food("Chicken, Beef or Pork Burrito", 9.50, "Seasoned chicken cooked in tomatoes and onions or shredded beef or smoked pulled pork, refried pinto beans, \ncheddar and Monterey jack cheese, lettuce, tomatoes, onions and sour cream, rolled in a warm flour tortilla.", "SM");
      menuArray.add(CBPB);
      Food FE = new Food("Fish Enchiladas", 9.50, "White corn tortillas filled with your choice of grilled salmon or tilapia covered \nwith a chipotle sauce and ancho chili pepper tomato sauce, topped with cheddar and Monterey jack cheese, queso blanco and cilantro.", "SM");
      menuArray.add(FE);
      Food FT = new Food("Fish Taco", 11.50, "2 soft tacos with your choice of grilled, seasoned tilapia or fresh salmon, lettuce, tomatoes and a sour cream jalapeno sauce.", "SM");
      menuArray.add(FT);
      Food VE = new Food("Veggie Enchiladas", 8.75, "White corn tortillas filled with grilled squash, mushrooms, broccoli, onion, peppers, pimentos and fresh spinach, \ncovered with a chipotle and ancho chili pepper tomato sauce, topped with cheddar and Monterey jack cheese, queso blanco and cilantro.", "SM");
      menuArray.add(VE);
      Food ST = new Food("Shrimp Tacos", 11.00, "2 soft tacos with grilled shrimp, lettuce, tomatoes and sour cream-jalapeno sauce.", "SM");
      menuArray.add(ST);
      Food CECQ = new Food("Con Espinaca y Camrones Quesadilla", 10.75, "Served with cheese, fresh spinach, red onions and fresh sauteed shrimp.", "SM");
      menuArray.add(CECQ);
      //Al Lado
      Food SGV = new Food("Side Grilled Veggies", 2.95, "No desc", "SIDE");
      menuArray.add(SGV);
      Food CHL = new Food("Chips (Large)", 3.50, "No desc", "SIDE");
      menuArray.add(CHL);
      Food CHS = new Food("Chips (Small)", 3.50, "No desc", "SIDE");
      menuArray.add(CHS);
      Food SAS = new Food("Salsa (Small)", 1.75, "No desc", "SIDE");
      menuArray.add(SAS);
      Food FBB = new Food("Frijoles (Black Beans)", 2.50, "No desc", "SIDE");
      menuArray.add(FBB);
      Food CSTG = new Food("Chips & Salsa To Go (Small)", 2.95, "No desc", "SIDE");
      menuArray.add(CSTG);
      Food SC = new Food("Sour Cream", 0.95, "No desc", "SIDE");
      menuArray.add(SC);
      Food RPB = new Food("Refried Pinto Beans", 2.50, "No desc", "SIDE");
      menuArray.add(RPB);
      Food PGB = new Food("Pan (Garlic Bread)", 0.95, "No desc", "SIDE");
      menuArray.add(PGB);
      Food GSS = new Food("Guacamole (Small Side)", 3.95, "No desc", "SIDE");
      menuArray.add(GSS);
      Food LAT = new Food("Lettuce & Tomatoes", 2.50, "No desc", "SIDE");
      menuArray.add(LAT);
      Food SAL = new Food("Salsa (Large)", 3.75, "No desc", "SIDE");
      menuArray.add(SAL);
      Food AYR = new Food("Arroz (Yellow Rice)", 2.50, "No desc", "SIDE");
      menuArray.add(AYR);
      Food TORT = new Food("Tortillas (2)", 0.95, "No desc", "SIDE");
      menuArray.add(TORT);
      Food SISA = new Food("Side Salad", 3.50, "No desc", "SIDE");
      menuArray.add(SISA);
      Food CSTGL = new Food("Chips & Salsa To Go (Large)", 4.50, "No desc", "SIDE");
      menuArray.add(CSTGL);
      Food JALA = new Food("Jalapenos", 0.95, "No desc", "SIDE");
      menuArray.add(JALA);
      //Bebidas
      Food SIT = new Food("Sweet Iced Tea", 1.95, "No desc", "BEBIDAS");
      menuArray.add(SIT);
      Food SODA = new Food("Soda", 1.65, "No desc", "BEBIDAS");
      menuArray.add(SODA);
      Food LEM = new Food("Lemonade", 1.95, "No desc", "BEBIDAS");
      menuArray.add(LEM);
      Food HOR = new Food("Horchata", 1.95, "Sweetened rice milk with a hint of cinnamon, almond and vanilla, served over rice.", "BEBIDAS");
      menuArray.add(HOR);
      Food JUG = new Food("Jugos", 1.75, "Juice", "BEBIDAS");
      menuArray.add(JUG);
   }
   //This controlles the function of the menu/order/and check. It makes all of the print statements and calulates tax and splits in the order
   public static void startMenu(){
      Scanner input = new Scanner(System.in);
      Menu order = new Menu();
      boolean loop = true;
      Menu.generateMenu();
      while(loop == true){
         System.out.print("Enter the name of the item to add to the order \nor type \"menu\" to get the full menu and \"order\" \nto view your order, if you are finished type \"check\" to get your check!: ");
         String userInput = input.nextLine();
         if(userInput.equalsIgnoreCase("menu") == false && userInput.equalsIgnoreCase("order") == false && userInput.equalsIgnoreCase("check") == false){
               if(order.getFood(userInput) != null){
               System.out.println("~~~~~~~~~~~~~~");
               System.out.println(order.getFood(userInput));
               System.out.println("$" + order.getPrice(userInput));
               System.out.println(order.getDesc(userInput));
               System.out.println("~~~~~~~~~~~~~~");
               Order.takeOrder(userInput);
               System.out.println("~~~~~~~~~~~~~~");
               }else{
               System.out.println("~~~~~~~~~~~~~~");
               System.out.println("Sorry that is an invalid item, please try again!");
               System.out.println("~~~~~~~~~~~~~~");
               }
         }else if(userInput.equalsIgnoreCase("menu")){
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println(order.getMenu());
            System.out.println("~~~~~~~~~~~~~~");
         }else if(userInput.equalsIgnoreCase("order")){
            System.out.println("~~~~~~~~~~~~~~");
            System.out.print("Here is your order!\n");
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println(Order.receipt);
            System.out.println("~~~~~~~~~~~~~~");
            System.out.println("Total Money Owed (Before Taxes): " + "$" + Math.round(Order.totalPrice * 100.0) / 100.0);
            //Order.orderArray.get(i).getName() + " with " + Order.orderArray.get(i).getSide() + " -- $" + Order.orderArray.get(i).getPrice()
            System.out.println("~~~~~~~~~~~~~~");
         }else if(userInput.equalsIgnoreCase("check")){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Generating Receipt...");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(Order.receipt);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Total Money Owed (Before Taxes): " + "$" + Math.round(Order.totalPrice * 100.0) / 100.0);
            System.out.println("Tax Precent: 8.90%");
            System.out.println("Total Money Owed (Including Taxes): " + "$" + Math.round((Order.totalPrice * 1.089) * 100.0) / 100.0);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("How many times would you like to split the bill? \n(Enter the number of splits or 1 if no splits): ");
            int splitOrder = input.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Summarizing your order below...");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("      ~La Fonda~      ");
            System.out.println(Order.receipt);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Total Money Owed (Before Taxes): " + "$" + Math.round(Order.totalPrice * 100.0) / 100.0);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Tax Precent: 8.90%");
            System.out.println("Total Money Owed (Including Taxes): " + "$" + Math.round((Order.totalPrice * 1.089) * 100.0) / 100.0);
            //System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Total Money Owed per Split (Including Taxes): " + "$" + Math.round(((Order.totalPrice / splitOrder) * 1.089) * 100.0) / 100.0);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Thank you for coming to La Fonda! Have a nice day!");
            loop = false;
         }
      }
   }
   //Return Name of Food
   public String getFood(String f){
      for(int i = 0; i < menuArray.size(); i++){
         if(f.equalsIgnoreCase(menuArray.get(i).getName())){
            itemName = menuArray.get(i).getName();
            i = menuArray.size();
         }
      }
      return itemName;
   }
   //Return Price of Food
   public double getPrice(String f){
      for(int i = 0; i < menuArray.size(); i++){
         if(f.equalsIgnoreCase(menuArray.get(i).getName())){
            itemPrice = menuArray.get(i).getPrice();
            i = menuArray.size();
         }
      }
      return itemPrice;
   }
   //Return Desc of Food
   public String getDesc(String f){
      for(int i = 0; i < menuArray.size(); i++){
         if(f.equalsIgnoreCase(menuArray.get(i).getName())){
            itemDesc = menuArray.get(i).getDesc();
            i = menuArray.size();
         }
      }
      return itemDesc;
   }
   //Return size of array
   public static ArrayList getMenuArray(){
      return menuArray;
   }
   //Return names of Food from the Menu
   public static String getMenu(){
      String menuAppetizers = "Aperitivos, Ensaladas Y Sopas:\n~~~~~~~~~~\n";
      String menuSpecialty = "~~~~~~~~~~\nTradicion De Espana Our House Specialty:\n~~~~~~~~~~\n";
      String menuCubanGrill = "~~~~~~~~~~\nDe La Parrilla Cubana:\n~~~~~~~~~~\n";
      String menuCubanSand = "~~~~~~~~~~\nBocadillos Cubanos:\n~~~~~~~~~~\n";
      String menuMexico = "~~~~~~~~~~\nUn Sabor Mexicano:\n~~~~~~~~~~\n";
      String menuSides = "~~~~~~~~~~\nAl Lado:\n~~~~~~~~~~\n";
      String menuDrinks = "~~~~~~~~~~\nBebidas:\n~~~~~~~~~~\n";
      String menuList = "";
      for(int i = 0; i < menuArray.size(); i++){
         if(menuArray.get(i).getType().equalsIgnoreCase("AES")){
            menuAppetizers = menuAppetizers + menuArray.get(i).getName() + " $" + menuArray.get(i).getPrice() + "\n";
         }
         if(menuArray.get(i).getType().equalsIgnoreCase("HS")){
            menuSpecialty = menuSpecialty + menuArray.get(i).getName() + " $" + menuArray.get(i).getPrice() + "\n";
         }
         if(menuArray.get(i).getType().equalsIgnoreCase("DLPC")){
            menuCubanGrill = menuCubanGrill + menuArray.get(i).getName() + " $" + menuArray.get(i).getPrice() + "\n";
         }
         if(menuArray.get(i).getType().equalsIgnoreCase("BC")){
            menuCubanSand = menuCubanSand + menuArray.get(i).getName() + " $" + menuArray.get(i).getPrice() + "\n";
         }
         if(menuArray.get(i).getType().equalsIgnoreCase("SM")){
            menuMexico = menuMexico + menuArray.get(i).getName() + " $" + menuArray.get(i).getPrice() + "\n";
         }
         if(menuArray.get(i).getType().equalsIgnoreCase("SIDE")){
            menuSides = menuSides + menuArray.get(i).getName() + " $" + menuArray.get(i).getPrice() + "\n";
         }
         if(menuArray.get(i).getType().equalsIgnoreCase("BEBIDAS")){
            menuDrinks = menuDrinks + menuArray.get(i).getName() + " $" + menuArray.get(i).getPrice() + "\n";
         }
         menuList = "Menu\n~~~~~~~~~~~~~~~~~\n" + menuAppetizers + menuSpecialty + menuCubanGrill
            + menuCubanSand + menuMexico + menuSides + menuDrinks;
      }
      return menuList;
   }
}