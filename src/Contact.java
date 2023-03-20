import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Contact extends JFrame implements ActionListener{
    JButton home;
    Contact(){

        JLabel contact = new JLabel();
        contact.setBounds(20, 60, 300, 300);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 18));
        contact.setForeground(Color.BLACK);
        contact.setText(
                "<html>"+
                        "1. Khushi Sharma"+"<br><br>"+
                        "   ks1392003@gmail.com" +"<br><br>"+
                        "2. Gagan Tomar" + "<br><br>" +
                        "   gagan.tomar444@gmail.com"+"<br><br>"+
                        "3. Bharat Chudasama" + "<br><br>" +
                        "   bharatchudasama056@gmail.com"+

                        "<html>"
        );
        add(contact);

        JLabel heading1 = new JLabel("Contact Us");
        heading1.setBounds(80,10,200,40);
        heading1.setFont(new Font("Tahoma",Font.BOLD,35));
        heading1.setForeground(Color.BLACK);
        add(heading1);

        home = new JButton("Home");
        home.setBounds(120,500,80,25);
        home.addActionListener(this);
        add(home);

        getContentPane().setBackground(Color.WHITE);
        setBounds(50,50,380,640);
        setLayout(null);
        setVisible(true);
        setTitle("Contact");
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==home){
            new Home();
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new Contact();
    }
}
