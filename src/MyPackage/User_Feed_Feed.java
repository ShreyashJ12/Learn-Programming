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
public class User_Feed_Feed {
    String un,title;
    int like,fid;
    Date d;

    public User_Feed_Feed(int fid,String un, String title, int like, Date d) {
        this.fid=fid;
        this.un = un;
        this.title = title;
        this.like = like;
        this.d = d;
    }

    public String getUn() {
        return un;
    }

    public String getTitle() {
        return title;
    }

    public int getLike() {
        return like;
    }

    public int getFid() {
        return fid;
    }

    public Date getD() {
        return d;
    }
    
    
}
