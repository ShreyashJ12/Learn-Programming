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
public class User_Feed_Render extends DefaultListCellRenderer implements ListCellRenderer<Object>
{
    public Component getListCellRendererComponent(JList list, Object value, int index,boolean isSelected, boolean cellHasFocus)
    {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            
            User_Feed_Feed label=(User_Feed_Feed) value;
            
            String un=label.getUn();
            String title = label.getTitle();
            int like=label.getLike();
            Date d=label.getD();
            
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
            
            String cell="<html>\n" +
            "<body>\n" +
            "  <pre >\n" +
            "  <center>\n" +
            "  	<table border=\"1\">\n" +
            "    	<tr>\n" +
            "        	<td>Username :</td>\n" +
            "            <td>"+un+"</td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "        	<td>Title :</td>\n" +
            "            <td>"+title+"</td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "        	<td>Like Count :</td>\n" +
            "            <td>"+like+"</td>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "        	<td>Date :</td>\n" +
            "            <td>"+d+"</td>\n" +
            "        </tr>\n" +
            "    </table>\n" +
            "    <center>\n" +
            "  </pre>\n" +
            "  </body>\n" +
            "</html>";
            this.setText(cell);
            this.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
            
            return this;
            
    
    }
    
}

