/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography.classical;

/**
 *
 * @author MC03353
 */
public class CaeserCypher {
    
    public static String ceaserCypher(String plainText, int shift) {
        StringBuilder cipherText = new StringBuilder();
                
        for(int j=0; j<plainText.length(); j++){
            
            if(Character.isUpperCase(plainText.charAt(j))){
                char c = (char)((((int)plainText.charAt(j)) + shift - 65) % 26 + 65);
                cipherText.append(c);
            } else { char c = (char)((((int)plainText.charAt(j)) + shift - 97) % 26 + 97);
                cipherText.append(c);
            }
        }//end of for loop
        
        System.out.println("\nPlaintext: " + plainText);
        System.out.println("Shift: " + shift);
        System.out.println("Ciphertext: " + cipherText.toString() + "\n");
        return cipherText.toString();
    }
}