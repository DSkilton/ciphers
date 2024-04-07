/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 *
 * @author Duncan Skilton
 */

//        http://practicalcryptography.com/ciphers/

public class CryptographyMain {
    protected static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
//        Runtime.getRuntime().exec(new String[]{"cmd", "/c","start chrome https://charlesreid1.github.io/enigma-cipher-implementation-part-2-pseudocode.html"});
        Menus.mainMenu();
        
        
    }
    
    
}
