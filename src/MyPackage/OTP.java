/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.util.Random;

/**
 *
 * @author Pritam
 */
public class OTP {
    
    private static int len=6;
 
   
    static String generate()
    {
        
        
        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
          //      String symbols = "!@#$%^&*_=+-/.?<>)";
 
 
        String values = Capital_chars + numbers /*+ Small_chars + symbols*/;
 
        Random rndm_method = new Random();
 
        char[] password = new char[len];
 
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] =
              values.charAt(rndm_method.nextInt(values.length()));
 
        }
        System.out.print(new String(password));
        return (new String(password));
    }
    
}
