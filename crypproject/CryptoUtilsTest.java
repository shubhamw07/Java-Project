//package crypproject;

import java.io.File;
 
public class CryptoUtilsTest {
    public static void main(String[] args) {
        String key = "This is my first";
        File inputFile = new File("doc.txt");
        File encryptedFile = new File("encrypted.txt");
        File decryptedFile = new File("decrypted.txt");
         
        try {
            CryptoUtils.encrypt(key, inputFile, encryptedFile);
            CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
