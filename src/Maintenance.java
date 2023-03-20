import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maintenance extends JFrame implements ActionListener {
    JButton submit , exit ;
    Maintenance(){

        JLabel heading1 = new JLabel("Road");
        heading1.setBounds(120,10,200,40);
        heading1.setFont(new Font("Tahoma",Font.BOLD,35));
        heading1.setForeground(Color.BLACK);
        add(heading1);

        JLabel heading2 = new JLabel("Maintenance");
        heading2.setBounds(60,60,300,40);
        heading2.setFont(new Font("Tahoma",Font.BOLD,35));
        heading2.setForeground(Color.BLACK);
        add(heading2);

        JLabel heading3 = new JLabel("State");
        heading3.setBounds(20,150,100, 30);
        heading3.setFont(new Font("Tahoma",Font.PLAIN,25));
        heading3.setForeground(Color.BLACK);
        add(heading3);

        JTextField state = new JTextField("");
        state.setBounds(120, 150, 220, 30);
        state.setFont(new Font("Tahoma",Font.PLAIN,15));
        state.setForeground(Color.BLACK);
        add(state);

        JLabel heading4 = new JLabel("Location");
        heading4.setBounds(20,200,100, 30);
        heading4.setFont(new Font("Tahoma",Font.PLAIN,25));
        heading4.setForeground(Color.BLACK);
        add(heading4);

        JTextField location = new JTextField("");
        location.setBounds(120, 200, 220, 30);
        location.setFont(new Font("Tahoma",Font.PLAIN,15));
        location.setForeground(Color.BLACK);
        add(location);

        JLabel heading5 = new JLabel("Details");
        heading5.setBounds(20,250,100, 30);
        heading5.setFont(new Font("Tahoma",Font.PLAIN,25));
        heading5.setForeground(Color.BLACK);
        add(heading5);

        JTextField details = new JTextField();
        details.setBounds(120, 250, 220, 100);
        details.setFont(new Font("Tahoma",Font.PLAIN,15));
        details.setForeground(Color.BLACK);
        add(details);

        submit = new JButton("Submit");
        submit.setBounds(90,500,80,25);
        submit.addActionListener(this);
        add(submit);

        exit = new JButton("Exit");
        exit.setBounds(200,500,80,25);
        exit.addActionListener(this);
        add(exit);

        getContentPane().setBackground(Color.WHITE);
        setBounds(50,50,380,640);
        setLayout(null);
        setVisible(true);
        setTitle("Road Maintenance");

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==submit){
            new Home();
            setVisible(false);
        } else if (ae.getSource()==exit) {
            new Home();
            setVisible(false);
        }

    }
    public static void main(String[] args) {
        new Maintenance();
    }
}
