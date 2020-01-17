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
public class mainMenu {
    
    static void mainMenu(){
        boolean choice = true;
        int menuNumber; 
        
        while (choice != true){
        
            System.out.println("Choose one of the following: "
                    + "1. Classical"
                    + "2. Mechanical"
                    + "3. Modern ");

            menuNumber = CryptographyMain.sc.nextInt();

            switch (menuNumber) {
                case 1:
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
            }
        }
    }
    
    static void classicalMenu(){
    
    }
    
    static void mechanicalMenu(){
    
    }
    
    static void modernMenu(){
    
    }
    
}
