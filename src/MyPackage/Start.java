/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import javax.swing.JFrame;

/**
 *
 * @author Aman
 */
public class Start {
    public static void main(String ar[])
    {
        JFrame jf=new JFrame();
        jf.setVisible(false);
        
        User_Login a=new User_Login();
        a.setVisible(true);
       // System.out.print("asd");
    }
}
