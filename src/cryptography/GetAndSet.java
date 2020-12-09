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
 * @author MC03353
 */
public class GetAndSet {
    private static String plainText;
    private static int shift;
    private static byte[] hash;

    public GetAndSet(String plainText, int shift) {
        GetAndSet.plainText = plainText;
        GetAndSet.shift = shift;
    }
    
    public GetAndSet (String plainText){
        GetAndSet.plainText = plainText;
    }
    
    public GetAndSet (int shift){
        GetAndSet.shift = shift;
    }  

    public static String getPlainText() {
        return plainText;
    }

    public static void setPlainText(String plainText) {
        GetAndSet.plainText = plainText;
    }

    public static int getShift() {
        return shift;
    }

    public static void setShift(int shift) {
        GetAndSet.shift = shift;
    }

    public static byte[] getHash() throws NoSuchAlgorithmException{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        return hash = messageDigest.digest(GetAndSet.getPlainText().getBytes(StandardCharsets.UTF_8));
    }

    public static void setHash(byte[] hash) {
        GetAndSet.hash = hash;
    }      
}
