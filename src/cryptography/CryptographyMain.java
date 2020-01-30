/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author MC03353
 */

//        https://www.geeksforgeeks.org/caesar-cipher-in-cryptography/
//        http://practicalcryptography.com/ciphers/

public class CryptographyMain {
    public static Scanner sc = new Scanner (System.in);// in the real world, you would not make this public
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        
        /* The following need moving to the menu methods. 
         * Consider changing public statics above to encapsulate them 
         * finish classical menu and caeser cipher 
         * move Sha256 code to class
         */
        
        MainMenu.mainMenu();
        
//        Sha256.cryptoLibrary(plainText);
//        Sha256.byteToHex(hash);
    }
    
    
}
