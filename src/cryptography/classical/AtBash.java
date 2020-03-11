/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography.classical;

/**
 *
 * @author Duncan Skilton
 */
public class AtBash {
    public static String atBash(String plainText){
        String cipherText = "";
        plainText = removeChars(plainText.toLowerCase());
        
        for(char c : plainText.toCharArray()){
            if(Character.isLetter(c)){
                cipherText += (char)('a' +('z' - c));
            } else {
                cipherText += c;
            }
        }
        return getSubStrings(cipherText);
    }//end of encode
    
    private static String getSubStrings(String input){
        String cipherText = "";
        for(int i = 0; i < input.length(); i += 5){
            if(i + 5 <= input.length()){
                cipherText += (input.substring(i, i + 5) + " ");
            } else {
                cipherText += (input.substring(i) + " ");
            }
        }            
        System.out.println(cipherText);
        return cipherText;
    }//end of getSubStrings
    
    private static String removeChars(String input){
        String out = "";
        for(char c : input.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                out  += c;
            }
        }
        return out;
    }
}//end of class
