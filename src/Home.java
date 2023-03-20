
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame  implements ActionListener{
    JButton aboutUs , contact , help ,accident  , report , maintenance;

    Home(){


        JLabel heading1 = new JLabel("Urban Safe");
        heading1.setBounds(65,20,300,40);
        heading1.setFont(new Font("Tahoma",Font.BOLD,40));
        heading1.setForeground(Color.BLACK);
        add(heading1);

        //JLabel a = new JLabel("Accident Prevention");


        accident = new JButton("Accident Prevention");
        accident.setBounds(30,160,300,35);
        accident.setFont(new Font("Railways",Font.PLAIN,27));
        accident.setForeground(Color.WHITE);
        accident.setBackground(Color.BLACK);
        accident.addActionListener(this);
        add(accident);

        maintenance = new JButton("Road Maintenance");
        maintenance.setBounds(30,250,300,35);
        maintenance.setFont(new Font("Railways",Font.PLAIN,27));
        maintenance.setForeground(Color.WHITE);
        maintenance.setBackground(Color.BLACK);
        maintenance.addActionListener(this);
        add(maintenance);

        report = new JButton("Report Violation");
        report.setBounds(30,340,300,35);
        report.setFont(new Font("Railways",Font.PLAIN,27));
        report.setForeground(Color.WHITE);
        report.setBackground(Color.BLACK);
        report.addActionListener(this);
        add(report);

        //creating footer
        aboutUs = new JButton("About");
        aboutUs.setBounds(50,500,80,25);
        aboutUs.addActionListener(this);
        add(aboutUs);

        contact = new JButton("Contact");
        contact.setBounds(130,500,80,25);
        contact.addActionListener(this);
        add(contact);

        help = new JButton("Help");
        help.setBounds(210,500,80,25);
        help.addActionListener(this);
        add(help);

        getContentPane().setBackground(Color.WHITE);
        setBounds(50,50,380,640);
        setLayout(null);
        setVisible(true);
        setTitle("Home");

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==aboutUs){
            new AboutUs();
            setVisible(false);

        }else if(ae.getSource()==contact){
            new Contact();
            setVisible(false);
        }else if(ae.getSource()==help){
            new Help();
            setVisible(false);
        } else if (ae.getSource()==accident) {
            new Accident();
            setVisible(false);

        } else if (ae.getSource()==maintenance) {
            new Maintenance();
            setVisible(false);
        } else if (ae.getSource()==report) {
            new Report();
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new Home();

    }
}