/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.util.Date;

/**
 *
 * @author Aman
 */
public class Teacher_Assessment_Check_Feed {
    int AID;
    String title;
    Date last_date;
    String class1;

    public Teacher_Assessment_Check_Feed(int AID, String title, Date last_date,String class1) {
        this.AID = AID;
        this.title = title;
        this.last_date = last_date;
        this.class1=class1;
    }
    
    public int getAID() {
        return AID;
    }

    public String getTitle() {
        return title;
    }

    public Date getLast_date() {
        return last_date;
    }
   public String getclass1(){
       return class1;
   } 

}
