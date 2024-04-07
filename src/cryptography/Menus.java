/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

import cryptography.classical.AtBash;
import cryptography.modern.Sha256;
import cryptography.classical.CaeserCypher;
import cryptography.classical.Rot13;
import static java.lang.System.exit;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author Duncan Skilton
 */
public class Menus {
    public static final Scanner SC = new Scanner(System.in);
    
    static void mainMenu() throws NoSuchAlgorithmException{
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
                    choice = true;
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
                    + "2. At Bash \n"
                    + "3. ROT13 \n"
                    + "0. Previous Menu \n");

            menuNumber = CryptographyMain.sc.nextInt();

            switch (menuNumber) {
                case 1:
                    System.out.print("Enter a String to be encoded: ");
                    PlainText.setPlainText(SC.nextLine());
//                    SC.next();
                                        
                    System.out.print("Enter shift amount (int): ");
                    PlainText.setShift(SC.nextInt());
                    
                    CaeserCypher.ceaserCypher(PlainText.getPlainText(), PlainText.getShift());
                break;
                case 2:
                    System.out.print("Enter a String to be encoded: ");
                    String plainText = SC.nextLine();
                    PlainText.setPlainText(plainText);
                    
                    AtBash.atBash(PlainText.getPlainText());
                break;
                case 3:
                    System.out.print("Enter a String to be encoded: ");
                    PlainText.setPlainText(SC.next());
                    SC.nextLine();
                    Rot13.rot13(PlainText.getPlainText());
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
    
    static void modernMenu() throws NoSuchAlgorithmException{
        System.out.println("Enter a String to be encoded: ");
        PlainText.setPlainText(CryptographyMain.sc.next());
        CryptographyMain.sc.nextLine();
        System.out.println();
        Sha256.byteToHex(PlainText.getHash());
    }
    
}
