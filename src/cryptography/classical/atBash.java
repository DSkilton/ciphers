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
public class atBash {
    public String encode(String plainText){
        String cipherText = "";
        plainText = removeChars(plainText.toLowerCase());
        
        for(char c : plainText.toCharArray()){
            if(Character.isLetter(c)){
                cipherText += (char)('a' +('z' - c));
            } else {
                cipherText += c;
            }
        }
        return getSubStrings(cipherText).trim();
    }//end of encode
    
    private String getSubStrings(String input){
        String out = "";
        for(int i = 0; i < input.length(); i += 5){
            if(i + 5 <= input.length()){
                out += (input.substring(i, i + 5) + " ");
            } else {
                out += (input.substring(i) + " ");
            }
        }            
        return out;
    }//end of getSubStrings
    
    private String removeChars(String input){
        String out = " ";
        for(char c : input.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                out  += c;
            }
        }
        return out;
    }
}//end of class
