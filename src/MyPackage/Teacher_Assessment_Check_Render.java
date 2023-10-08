/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Aman
 */
public class Teacher_Assessment_Check_Render extends DefaultListCellRenderer implements ListCellRenderer<Object>{
    public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            
            Teacher_Assessment_Check_Feed label=(Teacher_Assessment_Check_Feed) value;
            
            String Title = label.getTitle();
            int id=label.getAID();
            Date d=label.getLast_date();
            String class1=label.getclass1();
            
            if(isSelected)
            {
                this.setBackground(Color.BLACK);
                this.setForeground(Color.WHITE);
            }
            else
            {
                this.setBackground(Color.WHITE);
                this.setForeground(Color.BLACK);
            }
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
            
            String cell="<html>"
                        + "<pre style='font-family:cambria'>"
                        + "<h3>Assessment ID:"+id+"<br><br>Title: "+Title+"<br>"
                        + "<br>Last Date Of Submission :"+sdf.format(d)+""
                        + "<br><br>Class:"+class1+""
                        + "</h3></pre>"
                        + "</html>";
            this.setText(cell);
            this.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
            
            return this;
            
    
    }
    
}
