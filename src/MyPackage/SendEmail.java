        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Aman
 */
public class SendEmail {
    
    private static final String from = "learnprogrammingcontact";  // GMail user name (just the part before "@gmail.com")
    private static final String pass = "mvagvirckksbvmok"; // GMail password
       
    public void registerUserConfirmation(String email, String un, String fn, String ln, String password)
    {
        
        String to[] = {email}; // list of recipient email addresses
        
        String subject = "Registration Successful";
        String body = "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\"> <!-- utf-8 works for most cases -->\n" +
                "    <meta name=\"viewport\" content=\"width=device-width\"> <!-- Forcing initial-scale shouldn't be necessary -->\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \n" +
                "    <meta name=\"x-apple-disable-message-reformatting\">  \n" +
                "        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:300,500\" rel=\"stylesheet\">\n" +
                "    <style>\n" +
                "\n" +
                "        html,\n" +
                "        body {\n" +
                "            margin: 0 auto !important;\n" +
                "            padding: 0 !important;\n" +
                "            height: 100% !important;\n" +
                "            width: 100% !important;\n" +
                "        }\n" +
                "        * {\n" +
                "            -ms-text-size-adjust: 100%;\n" +
                "            -webkit-text-size-adjust: 100%;\n" +
                "        }\n" +
                "\n" +
                "        div[style*=\"margin: 16px 0\"] {\n" +
                "            margin:0 !important;\n" +
                "        }\n" +
                "\n" +
                "        table,\n" +
                "        td {\n" +
                "            mso-table-lspace: 0pt !important;\n" +
                "            mso-table-rspace: 0pt !important;\n" +
                "        }\n" +
                "        table {\n" +
                "            border-spacing: 0 !important;\n" +
                "            border-collapse: collapse !important;\n" +
                "            table-layout: fixed !important;\n" +
                "            margin: 0 auto !important;\n" +
                "        }\n" +
                "        table table table {\n" +
                "            table-layout: auto;\n" +
                "        }\n" +
                "        img {\n" +
                "            -ms-interpolation-mode:bicubic;\n" +
                "        }\n" +
                "        *[x-apple-data-detectors],  /* iOS */\n" +
                "        .x-gmail-data-detectors,    /* Gmail */\n" +
                "        .x-gmail-data-detectors *,\n" +
                "        .aBn {\n" +
                "            border-bottom: 0 !important;\n" +
                "            cursor: default !important;\n" +
                "            color: inherit !important;\n" +
                "            text-decoration: none !important;\n" +
                "            font-size: inherit !important;\n" +
                "            font-family: inherit !important;\n" +
                "            font-weight: inherit !important;\n" +
                "            line-height: inherit !important;\n" +
                "        }\n" +
                "        .a6S {\n" +
                "            display: none !important;\n" +
                "            opacity: 0.01 !important;\n" +
                "        }\n" +
                "        img.g-img + div {\n" +
                "            display:none !important;\n" +
                "           }\n" +
                "        \n" +
                "        @media only screen and (min-device-width: 375px) and (max-device-width: 413px) { /* iPhone 6 and 6+ */\n" +
                "            .email-container {\n" +
                "                min-width: 375px !important;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "    </style>\n" +
                "    <style>\n" +
                "        \n" +
                "        @media screen and (max-width: 480px) {\n" +
                "            .fluid {\n" +
                "                width: 100% !important;\n" +
                "                max-width: 100% !important;\n" +
                "                height: auto !important;\n" +
                "                margin-left: auto !important;\n" +
                "                margin-right: auto !important;\n" +
                "            }\n" +
                "            .stack-column,\n" +
                "            .stack-column-center {\n" +
                "                display: block !important;\n" +
                "                width: 100% !important;\n" +
                "                max-width: 100% !important;\n" +
                "                direction: ltr !important;\n" +
                "            }\n" +
                "            .stack-column-center {\n" +
                "                text-align: center !important;\n" +
                "            }\n" +
                "            .center-on-narrow {\n" +
                "                text-align: center !important;\n" +
                "                display: block !important;\n" +
                "                margin-left: auto !important;\n" +
                "                margin-right: auto !important;\n" +
                "                float: none !important;\n" +
                "            }\n" +
                "            table.center-on-narrow {\n" +
                "                display: inline-block !important;\n" +
                "            }\n" +
                "            .email-container p {\n" +
                "                font-size: 17px !important;\n" +
                "                line-height: 22px !important;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "    </style>\n" +
                "\n" +
                "</head>\n" +
                "<body width=\"100%\" bgcolor=\"#F1F1F1\" style=\"margin: 0; mso-line-height-rule: exactly;\">\n" +
                "    <center style=\"width: 100%; background: #F1F1F1; text-align: left;\">\n" +
                "\n" +
                "        <div style=\"max-width: 680px; margin: auto;\" class=\"email-container\">\n" +
                "        \n" +
                "			<table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" width=\"100%\" style=\"max-width: 680px;\" class=\"email-container\">\n" +
                "        <tr>\n" +
                "                    <td bgcolor=\"#333333\">\n" +
                "                        <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
                "                            <tr>\n" +
                "                                <td style=\"padding: 30px 40px 30px 40px; text-align: center;\">\n" +
                "                                   <img src=\"https://i.postimg.cc/VLJXV00k/logo.png\" width=\"100\" height=\"75\" alt=\"alt_text\" border=\"0\" style=\"height: auto; font-family: sans-serif; font-size: 15px; line-height: 20px; color: #555555;\">"+
                "                                </td>\n" +
                "                            </tr>\n" +
                "                        </table>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td background=\"https://image.ibb.co/g9idPx/background.png\" bgcolor=\"#222222\" align=\"center\" valign=\"top\" style=\"text-align: center; background-position: center center !important; background-size: cover !important;\">\n" +
                "                        <div>\n" +
                "                            <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" style=\"max-width:500px; margin: auto;\">\n" +
                "\n" +
                "                                <tr>\n" +
                "                                    <td height=\"20\" style=\"font-size:20px; line-height:20px;\">&nbsp;</td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                                <tr>\n" +
                "                                  <td align=\"center\" valign=\"middle\">\n" +
                "                                    \n" +
                "                                  <table>\n" +
                "                                     <tr>\n" +
                "                                         <td valign=\"top\" style=\"text-align: center; padding: 60px 0 10px 20px;\">\n" +
                "                                     \n" +
                "                                             <h1 style=\"margin: 0; font-family: 'Montserrat', sans-serif; font-size: 30px; line-height: 36px; color: #ffffff; font-weight: bold;\">WELCOME "+fn+" "+ln+"</h1>\n" +
                "                                         </td>\n" +
                "                                     </tr>\n" +
                "                                     <tr>\n" +
                "                                         <td valign=\"top\" style=\"text-align: center; padding: 10px 20px 15px 20px; font-family: sans-serif; font-size: 15px; line-height: 20px; color: #ffffff;\">\n" +
                "                                             <p style=\"margin: 0;\">Learn Together, Grow Together!</p>\n" +
                "                                         </td>\n" +
                "                                     </tr>\n" +
                "                                     <tr>\n" +
                "                                         <td valign=\"top\" align=\"center\" style=\"text-align: center; padding: 15px 0px 60px 0px;\">\n" +
                "\n" +
                "                                         </td>\n" +
                "                                     </tr> \n" +
                "                                  </table>\n" +
                "\n" +
                "                                  </td>\n" +
                "                                </tr>\n" +
                "                            \n" +
                "                                <tr>\n" +
                "                                    <td height=\"20\" style=\"font-size:20px; line-height:20px;\">&nbsp;</td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                            </table>\n" +
                "                        </div>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td bgcolor=\"#ffffff\">\n" +
                "                        <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
                "                            <tr>\n" +
                "                                <td style=\"padding: 40px 40px 20px 40px; text-align: left;\">\n" +
                "                                    <h1 style=\"margin: 0; font-family: 'Montserrat', sans-serif; font-size: 20px; line-height: 26px; color: #333333; font-weight: bold;\">YOUR ACCOUNT IS NOW ACTIVE</h1>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                            <tr>\n" +
                "                                <td style=\"padding: 0px 40px 20px 40px; font-family: sans-serif; font-size: 15px; line-height: 20px; color: #555555; text-align: left; font-weight:bold;\">\n" +
                "                                    <p style=\"margin: 0;\">Thank you for registering in Learn Programming System. We hope you can learn basic programming skills and improve it with others.\n" +
                "									After all this software is build on principle that,\"Learning together makes it easier\".</p>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                            <tr>\n" +
                "                                <td style=\"padding: 0px 40px 20px 40px; font-family: sans-serif; font-size: 15px; line-height: 20px; color: #555555; text-align: left; font-weight:normal;\">\n" +
                "                                    <p style=\"margin: 0;\">Your UserName is: "+un+"<br>\n Your Password is: "+password+"</p>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                            <tr>\n" +
                "                                <td style=\"padding: 0px 40px 20px 40px; font-family: sans-serif; font-size: 15px; line-height: 20px; color: #555555; text-align: left; font-weight:normal;\">\n" +
                "                                    <p style=\"margin: 0;\">Yours sincerely,</p>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "\n" +
                "                            <tr>\n" +
                "                                <td align=\"left\" style=\"padding: 0px 40px 40px 40px;\">\n" +
                "\n" +
                "                                    <table width=\"180\" align=\"left\">\n" +
                "                                        <tr>\n" +
                "                                          <td width=\"70\">\n" +
                "                                            <img src=\"https://i.postimg.cc/XJhzyGr1/TEACHER2.png\" width=\"65\" height=\"65\" style=\"margin:0; padding:0; border:none; display:block;\" border=\"0\" alt=\"\">\n" +
                "                                          </td>\n" +
                "                                          <td width=\"110\">\n" +
                "                                            \n" +
                "                                            <table width=\"\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "                                              <tr>\n" +
                "                                                <td align=\"left\" style=\"font-family: sans-serif; font-size:14px; line-height:20px; color:#222222; font-weight:bold;\" class=\"body-text\">\n" +
                "                                                  <p style=\"font-family: 'Montserrat', sans-serif; font-size:14px; line-height:20px; color:#222222; font-weight:bold; padding:0; margin:0;\" class=\"body-text\">Learn Programming Team</p>   \n" +
                "                                                </td>               \n" +
                "                                              </tr>\n" +
                "                                                                         \n" +
                "                                            </table>\n" +
                "\n" +
                "                                          </td>                        \n" +
                "                                        </tr>\n" +
                "                                    </table>\n" +
                "\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "\n" +
                "                        </table>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td bgcolor=\"#26a4d3\">\n" +
                "                        <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
                "                            <tr>\n" +
                "                                <td style=\"padding: 40px 40px 5px 40px; text-align: center;\">\n" +
                "                                    <h1 style=\"margin: 0; font-family: 'Montserrat', sans-serif; font-size: 20px; line-height: 24px; color: #ffffff; font-weight: bold;\">YOUR FEEDBACK IS IMPORTANT</h1>\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "                            <tr>\n" +
                "                                <td style=\"padding: 0px 40px 20px 40px; font-family: sans-serif; font-size: 17px; line-height: 23px; color: #aad4ea; text-align: center; font-weight:normal;\">\n" +
                "                                    <p style=\"margin: 0;\">Let us know what you think of our software at:</p>\n" +
                "								</td>\n" +
                "                            </tr>\n" +
                "							<tr>\n" +
                "								<td style=\"padding: 0px 40px 20px 40px; font-family: sans-serif; font-size: 17px; line-height: 23px; color: #aad4ea; text-align: center; font-weight:normal;\">\n" +
                "									<p style=\"color: white\">Email:</p>learnprogrammingcontact@gmail.com\n" +
                "									<p style=\"color: white\">Contact no:</p>9137329514\n" +
                "								</td>\n" +
                "							</tr>\n" +
                "							\n" +
                "                            <tr>\n" +
                "                                <td valign=\"middle\" align=\"center\" style=\"text-align: center; padding: 0px 20px 40px 20px;\">\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "\n" +
                "                        </table>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "                <tr>\n" +
                "                    <td bgcolor=\"#292828\">\n" +
                "                        <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\n" +
                "                            <tr>\n" +
                "                                <td style=\"padding: 30px 30px; text-align: center;\">\n" +
                "                                    \n" +
                "                                    <table align=\"center\" style=\"text-align: center;\">\n" +
                "                                        <tr>\n" +
                "                                            <td>\n" +
                "                                                <img src=\"http://glennsmith.me/email/litmus/images/facebook.png\" width=\"\" height=\"\" style=\"margin:0; padding:0; border:none; display:block;\" border=\"0\" alt=\"\">\n" +
                "                                            </td>\n" +
                "                                            <td width=\"10\">&nbsp;</td>\n" +
                "                                            <td>\n" +
                "                                                <img src=\"http://glennsmith.me/email/litmus/images/twitter.png\" width=\"\" height=\"\" style=\"margin:0; padding:0; border:none; display:block;\" border=\"0\" alt=\"\">\n" +
                "                                            </td>\n" +
                "                                            <td width=\"10\">&nbsp;</td>\n" +
                "                                            <td>\n" +
                "                                                <img src=\"http://glennsmith.me/email/litmus/images/instagram.png\" width=\"\" height=\"\" style=\"margin:0; padding:0; border:none; display:block;\" border=\"0\" alt=\"\">\n" +
                "                                            </td>\n" +
                "                                            <td width=\"10\">&nbsp;</td>\n" +
                "                                            <td>\n" +
                "                                                <img src=\"http://glennsmith.me/email/litmus/images/linkedin.png\" width=\"\" height=\"\" style=\"margin:0; padding:0; border:none; display:block;\" border=\"0\" alt=\"\">\n" +
                "                                            </td>\n" +
                "                                        </tr>\n" +
                "                                    </table>\n" +
                "\n" +
                "                                </td>\n" +
                "                            </tr>\n" +
                "\n" +
                "                        </table>\n" +
                "                    </td>\n" +
                "                </tr>\n" +
                "            </table>\n" +
                "        </div>\n" +
                "\n" +
                "    </center>\n" +
                "</body>\n" +
                "</html>";
        
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            
            message.setSubject(subject);
            message.setContent(body, "text/html; charset=utf-8");
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch(HeadlessException | MessagingException e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    }
    
    public void registerTeacherConfirmation(String email, String un, String fn, String ln, String password)
    {
        String to[] = {email}; // list of recipient email addresses
        
        String subject = "Registration Successful.";
        String body = "<html>\n" +
                        "<body>\n" +
                        "<pre><h3>\n" +
                        fn+" "+ln+",\n" +
                        "Admin has registered your email in Learn Programming software as Teacher\n" +
                        "Your user name is :<div style='color:red'>" + un +"</div>\n"+
                        "Your password is  :<div style='color:red'>" + password + "</div>\n"+
                        "\n" +
                        "</h3></pre>\n" +
                        "</body>\n" +
                        "</html>";
        
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            
            message.setSubject(subject);
            message.setContent(body, "text/html; charset=utf-8");
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch(HeadlessException | MessagingException e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void sendOTPEmail(String email)
    {
        String otp=OTP.generate();
        String to[] = {email}; // list of recipient email addresses
        
        String subject = "One Time Password";
        String body = "<html>\n" +
                        "  <body>\n" +
                        "    <div style='font-size:17px; font-family:cambria'>\n" +
                        "    OTP is generated for changing password of Learn Programming System acount associated with this email.<br><br>\n" +
                        "      Your OTP is:<br>\n" +
                        "     <center>\n" +
                        "      <div style='color:red;font-size:18px; font-family:cambria; border:2px solid black'>\n" +
                        "    		\n" +otp+
                        "      </div>\n" +
                        "       </center>\n" +
                        "    </div>\n" +
                        "    </body>\n" +
                        "  </html>";
        
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            
            message.setSubject(subject);
            message.setContent(body, "text/html; charset=utf-8");
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            
            
            try
            {
                Connection con=DBUtil.getConnection();
                PreparedStatement in,del;
                del=con.prepareStatement("delete from otps where email='"+email+"'");
                del.execute();
               
                in=con.prepareStatement("insert into otps values('1','"+otp+"','"+email+"')");
                in.execute();
            } 
            catch (SQLException ex) {
                Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           
        }
        catch(HeadlessException | MessagingException e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        
    }
    
    public void passwordChangedEmail(String email, String t,String upass)
    {
        String un = null;
        String type=null;
        if (t.equals("s"))
            type="Student";
        if (t.equals("t"))
            type="Teacher";
        
        try
        {
            Connection con=DBUtil.getConnection();
            PreparedStatement pr = null;
            
            if(t.equals("s"))
                pr=con.prepareStatement("select uname from user where email='"+email+"'");
            
            if(t.equals("t"))
                pr=con.prepareStatement("select tname from teacher where email='"+email+"'");
            
            ResultSet rs=pr.executeQuery();
            
            while(rs.next())
                un=rs.getString(1);
                
            System.out.print(un);
            
        }
        catch(Exception e)
        {
        }
        
        
        String to[] = {email}; // list of recipient email addresses
        
        String subject = "Your Password Changed.";
        String body = "<html>\n" +
                "<body>\n" +
                "    <pre style='font-family:cambria,font-size:40px'>\n" +
                "    Password for your "+type+" account associated with this email in LearnProgramming system has been changed!\n" +
                "   \n" +
                "   Your User Name: \n" +
                "   <h3 style='color:red'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+un+"</h5>\n" +
                "    Your Password:  \n" +
                "   <h3 style='color:red'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+upass+"</h5>\n" +
                "    <pre>\n" +
                "</body>\n" +
                "</html>";
        
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            
            message.setSubject(subject);
            message.setContent(body, "text/html; charset=utf-8");
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch(HeadlessException | MessagingException e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void updateSuccessful( String fn, String ln, String un, String email, String t)
    {
         
        String type=null;
        if (t.equals("s"))
            type="Student";
        if (t.equals("t"))
            type="Teacher";
        
        
        String to[] = {email}; // list of recipient email addresses
        
        String subject = "Your Account Updated Successfully!";
        String body = "<html>\n" +
                    "<body>\n" +
                    "  <pre>\n" +
                    "   Dear "+type+" "+fn+" "+ln+"("+un+"),\n" +
                    "   \n" +
                    "   Your account associated with this email address is updated sucessfully!\n" +
                    "  </pre>\n" +
                    "</body>\n" +
                    "</html>";
        
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            
            message.setSubject(subject);
            message.setContent(body, "text/html; charset=utf-8");
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch(HeadlessException | MessagingException e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void adminReply(String email, String name, String reply)
    {
        
        
        String to[] = {email}; // list of recipient email addresses
        
        String subject = "Admin replied to your query!";
        String body = "<html>\n" +
                    "<body>\n" +
                    "  <pre>\n" +
                    "   Dear "+name+",\n" +
                    "   \n" +
                    "   Admin has looked into your query!\n" +
                    "   \n" +
                    "   Admin reply's to your Query :\n" +
                    "   <div style='border:1px solid black'>\n" +reply+
                    "   </div>\n" +
                    "  </pre>\n" +
                    "</body>\n" +
                    "</html>";
        
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            
            message.setSubject(subject);
            message.setContent(body, "text/html; charset=utf-8");
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch(HeadlessException | MessagingException e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void teacherRemark(String email, String tname, String uname, String title, String remark, int marks)
    {
        try {
            
            
            String to[] = {email}; // list of recipient email addresses

            String subject = "Assignment about "+title+" is checked";
            String body = "<html>\n" +
                        "<body>\n" +
                        "  <pre>\n" +
                        "   Dear "+uname+",\n" +
                        "   \n" +
                        "   Teacher "+tname+", has checked your assessment named : "+title+"!\n" +
                        "   \n" +
                        "   Teacher's remark to your Assessment :\n" +
                        "   <div style='border:1px solid black'>\n" +remark+
                        "   </div>\n" +
                        "Marks obtainted :"+marks+
                        "  </pre>\n" +
                        "</body>\n" +
                        "</html>";

            Properties props = System.getProperties();
            String host = "smtp.gmail.com";
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.user", from);
            props.put("mail.smtp.password", pass);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);

        
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            
            message.setSubject(subject);
            message.setContent(body, "text/html; charset=utf-8");
            
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch(HeadlessException | MessagingException e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

