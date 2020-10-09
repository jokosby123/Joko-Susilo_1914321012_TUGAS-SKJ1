/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skj;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joko Susilo
 */
public class TugasSKJ1 {
       private static String result = "";

    public static String getEncryption(String password) {
        MessageDigest messageDigest;

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes("UTF8"));
            byte message[] = messageDigest.digest();

            for (int i = 0; i < message.length; i++) {
                result += Integer.toHexString((0x000000ff & message[i]) | 0xffffff00).substring(6);
            }

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(TugasSKJ1.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

}
