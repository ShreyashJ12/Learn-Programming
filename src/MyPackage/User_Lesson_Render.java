/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Aman
 */
public class User_Lesson_Render extends DefaultListCellRenderer implements ListCellRenderer<Object> {

    @Override
    public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            
            User_Lesson_Feed label=(User_Lesson_Feed)value;
            
            String Title = label.getTitle();
            int id=label.getLID();
            String class1=label.getClass1();
            
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
            
             String cell="<html>"
                     + "<pre style='font-family:cambria,font-size:100px'><h2>Lesson ID: "+id+" <br>"
                     + "<br>Title: "+Title+" <br>Class: "+class1+"</h2> </pre></h2></html>";
            this.setText(cell);
            this.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
            
            return this;
            
    
    } 
}
