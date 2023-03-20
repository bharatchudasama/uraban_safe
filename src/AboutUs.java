import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AboutUs extends JFrame implements ActionListener{
    JButton home;
    AboutUs(){

        JLabel heading1 = new JLabel("About Us");
        heading1.setBounds(80,10,200,40);
        heading1.setFont(new Font("Tahoma",Font.BOLD,35));
        heading1.setForeground(Color.BLACK);
        add(heading1);

        JLabel about = new JLabel();
        about.setBounds(20, 60, 300, 300);
        about.setFont(new Font("Tahoma", Font.PLAIN, 18));
        about.setForeground(Color.BLACK);
        about.setText(
                "<html>"+
                        "At Urban Safe, you can help any injured people instantly,"+
                        "make people aware about any road blockages," +
                        "report any violation - All with a few taps on your phone!" + "<br><br>" +
                        "It is all about building a bridge between public and government,"+
                        "by helping people to get instant help anytime, anywhere." + "<br><br>" +

                        "<html>"
        );
        add(about);

        home = new JButton("Home");
        home.setBounds(120,500,80,25);
        home.addActionListener(this);
        add(home);

        getContentPane().setBackground(Color.WHITE);
        setBounds(50,50,380,640);
        setLayout(null);
        setVisible(true);
        setTitle("About Us");
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==home){
            new Home();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new AboutUs();
    }

}
