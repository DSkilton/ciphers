/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

/**
 *
 * @author Duncan Skilton
 */
public class MainMenu {
    
    static void mainMenu(){
        boolean choice = true;
        int menuNumber; 
        
        while (choice != false){
            System.out.println("Choose one of the following: \n"
                    + "1. Classical \n"
                    + "2. Mechanical \n"
                    + "3. Modern \n");

            menuNumber = CryptographyMain.sc.nextInt();

            switch (menuNumber) {
                case 1:
                    choice = false;
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
        boolean choice = true;
        int menuNumber; 
        
        while (choice != true){
        
            System.out.println("Choose one of the following: "
                    + "1. Caeser Cypher "
                    + "2. TBC "
                    + "3. TBC ");

            menuNumber = CryptographyMain.sc.nextInt();

            switch (menuNumber) {
                case 1:
                    classicalMenu();
                    break;
                default:
                    break;
            }//end of switch 
        }//end of while loop
    }
    
    static void mechanicalMenu(){
    
    }
    
    static void modernMenu(){
    
    }
    
}
