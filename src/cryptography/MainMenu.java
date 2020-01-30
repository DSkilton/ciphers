/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

import static java.lang.System.exit;

/**
 *
 * @author Duncan Skilton
 */
public class MainMenu {
        
    static void mainMenu(){
        boolean choice = false;
        int menuNumber; 
        
        while (choice != true){
            System.out.println("Choose one of the following: \n"
                    + "1. Classical \n"
                    + "2. Mechanical \n"
                    + "3. Modern \n"
                    + "0. Exit \n");

            menuNumber = CryptographyMain.sc.nextInt();

            switch (menuNumber) {
                case 1:
                    choice = true;
                    classicalMenu();
                    break;
                case 2:
                    mechanicalMenu();
                    break; 
                case 3:
                    modernMenu();
                    break;
                default:
                    break;
            }//end of switch 
        }//end of while loop
    }//end of main menu 
    
    static void classicalMenu(){
        boolean choice = false;
        int menuNumber; 
        
        while (choice != true){
        
            System.out.println("Choose one of the following: \n"
                    + "1. Caeser Cypher \n"
                    + "2. TBC \n"
                    + "3. TBC \n"
                    + "0. Previous Menu \n");

            menuNumber = CryptographyMain.sc.nextInt();

            switch (menuNumber) {
                case 1:
                    System.out.print("Enter a String to be encoded: ");
                    GetAndSet.setPlainText(CryptographyMain.sc.next());
                    CryptographyMain.sc.nextLine();
                                        
                    System.out.print("Enter shift amount (int): ");
                    GetAndSet.setShift(CryptographyMain.sc.nextInt());
                    
//                    System.out.println("***************");
//                    System.out.println("\nThis should be plain text " + GetAndSet.getPlainText()); //TESTING GETTER      
//                    System.out.println("\nThis should be shift " + GetAndSet.getShift()); //TESTING GETTER      
//                    System.out.println("***************");

                    CaeserCypher.ceaserCypher(GetAndSet.getPlainText(), GetAndSet.getShift());
                    break;
                    
                case 0:
                    System.out.println("exit");
                    exit(0);
                    choice = true;
                    break;
                default:
                    break;
            }//end of switch 
        }//end of while loop
    }// end of classicalMenu
    
    static void mechanicalMenu(){
    
    }
    
    static void modernMenu(){
    
    }
    
}
