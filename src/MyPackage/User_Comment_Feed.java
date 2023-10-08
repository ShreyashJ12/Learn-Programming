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
public class User_Comment_Feed {
    String un,comm;
    Date d;

    public User_Comment_Feed(String un, String comm, Date d) {
        this.un = un;
        this.comm = comm;
        this.d = d;
    }

    public String getUn() {
        return un;
    }

    public String getComm() {
        return comm;
    }

    public Date getD() {
        return d;
    }
    
    
}
