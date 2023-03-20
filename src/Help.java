import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Help extends JFrame implements ActionListener{
    JButton home;
    Help(){

        JLabel heading1 = new JLabel("Help");
        heading1.setBounds(120,10,200,40);
        heading1.setFont(new Font("Tahoma",Font.BOLD,35));
        heading1.setForeground(Color.BLACK);
        add(heading1);

        home = new JButton("Home");
        home.setBounds(120,500,80,25);
        home.addActionListener(this);
        add(home);

        JLabel help = new JLabel();
        help.setBounds(20, 60, 300, 450);
        help.setFont(new Font("Tahoma", Font.PLAIN, 18));
        help.setForeground(Color.BLACK);
        help.setText(
                "<html>"+
                        "1. You can choose from the given options to raise any query."+"<br><br>"+
                        "2. You can use ACCIDENT PREVENTION to get instant help from nearby hospitals, police station and ambulance." +"<br><br>"+
                        "3. You can use ROAD MAINTENANCE to make people aware about any road blockage , broken or under construction roads." + "<br><br>" +
                        "4. You can use REPORT VIOLATION to report any mishappening you faced or encountered."+"<br><br>"+

                        "<html>"
        );
        add(help);

        getContentPane().setBackground(Color.WHITE);
        setBounds(50,50,380,640);
        setLayout(null);
        setVisible(true);
        setTitle("Help");
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==home){
            new Home();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Help();
    }
}