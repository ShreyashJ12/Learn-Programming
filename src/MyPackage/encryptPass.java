/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

/**
 *
 * @author Aman
 */
public class encryptPass {
    public static String encrypt(String pass)
    {
        
        String hashed = BCrypt.hashpw(pass, BCrypt.gensalt(12));
        return hashed;
    }
    
}
