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
    public static String plainText; //this could be encapsulated (written in a separate class and declared private) to restric access
    public static byte[] hash; 
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
        
        /* The following need moving to the menu system. 
         * Consider changing public statics above to encapsulate them 
         */
        System.out.print("Input text to be hashed: "); 
        plainText = sc.nextLine();
        
        System.out.print("\nInput shift: "); 
        int shift = sc.nextInt();
        caeserCypher.ceaserCypher(plainText, shift);

        Sha256.cryptoLibrary(plainText);
        Sha256.byteToHex(hash);
    }
    
    
}
