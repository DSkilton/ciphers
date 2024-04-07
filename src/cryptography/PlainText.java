/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptography;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Duncan Skilton
 */
public class PlainText {
    private static String plainText;
    private static int shift;
    private static byte[] hash;

    public PlainText(String plainText, int shift) {
        PlainText.plainText = plainText;
        PlainText.shift = shift;
    }
    
    public PlainText(String plainText){
        PlainText.plainText = plainText;
    }
    
    public PlainText(int shift){
        PlainText.shift = shift;
    }  

    public static String getPlainText() {
        return plainText;
    }

    public static void setPlainText(String plainText) {
        PlainText.plainText = plainText;
    }

    public static int getShift() {
        return shift;
    }

    public static void setShift(int shift) {
        PlainText.shift = shift;
    }

    public static byte[] getHash() throws NoSuchAlgorithmException{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        return hash = messageDigest.digest(PlainText.getPlainText().getBytes(StandardCharsets.UTF_8));
    }

    public static void setHash(byte[] hash) {
        PlainText.hash = hash;
    }      
}
