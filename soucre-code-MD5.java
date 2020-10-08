/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skj;

/**
 *
 * @author Joko Susilo
 */
public class TugasMD5 {
        public static void main(String[] args) {
        // TODO code application logic here

        String plainText = "Tugas SKJ1 Implementasi MD5";
        System.out.println("Plaintext:" + plainText);
        System.out.println("Chipertext(MD5):" + TugasSKJ1.getEncryption(plainText).toUpperCase());
    }
}

