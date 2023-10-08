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
public class User_Lesson_Feed 
{
    int LID;
    String title;
    String class1;

    User_Lesson_Feed(int lid, String title,String class1) {
        this.LID=lid;
        this.title=title;
        this.class1=class1;
    }

    public int getLID() {
        return LID;
    }

  
   
    public String getTitle() {
        return title;
    }
    
    public String getClass1(){
        return class1;
    }
    

  
   
    
}
