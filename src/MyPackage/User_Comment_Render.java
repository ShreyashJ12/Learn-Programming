/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Aman
 */
public class User_Comment_Render extends DefaultListCellRenderer implements ListCellRenderer<Object>{
    
    JPanel p;
    JTextArea ta;
    JScrollPane scroll;
    public User_Comment_Render()
    {
        p = new JPanel();
        p.setLayout(new BorderLayout());

        
        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        p.add(ta, BorderLayout.CENTER);
    }
    public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            
            User_Comment_Feed label=(User_Comment_Feed) value;
            
            String un,comm;
            Date d;
            un=label.getUn();
            comm=label.getComm();
            d=label.getD();
            
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
            //SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
            
            String cell="User "+un+" says :\t\t\t\t\t\t\t\t\t"+d+"\n" +
                        ""+comm+"\n";
            ta.setText(cell);
            ta.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
            
            return ta;
            
    }
    
}
