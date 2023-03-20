import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.*;
//

public class Login extends JFrame implements ActionListener {
    JButton next , exit ;
    public static String[] logarr = new String[2];
    JTextField userName , contactNum ;
    Login(){

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Logo.png"));
        Image i5 = i4.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(100,0,150,150);
        add(image2);

        JLabel heading1 = new JLabel("Enter Your Name");
        heading1.setBounds(90,200,200,30);
        heading1.setFont(new Font("Tahoma",Font.PLAIN,20));
        heading1.setForeground(Color.BLACK);
        add(heading1);

        JLabel heading2 = new JLabel("Contact Number");
        heading2.setBounds(90,300,150,30);
        heading2.setFont(new Font("Tahoma",Font.PLAIN,20));
        heading2.setForeground(Color.BLACK);
        add(heading2);

        userName = new JTextField("");
        userName.setBounds(50, 240, 250, 30);
        userName.setFont(new Font("Tahoma",Font.PLAIN,15));
        userName.setForeground(Color.BLACK);
        add(userName);

        contactNum = new JTextField("");
        contactNum.setBounds(50, 340, 250, 30);
        contactNum.setFont(new Font("Tahoma",Font.PLAIN,15));
        contactNum.setForeground(Color.BLACK);
        add(contactNum);

        next = new JButton(" Next ");
        next.setBounds(80,460,80,30);
        next.addActionListener(this);
        add(next);

        exit = new JButton(" Exit ");
        exit.setBounds(170,460,80,30);
        exit.addActionListener(this);
        add(exit);



        getContentPane().setBackground(Color.WHITE);
        setBounds(50,50,380,640);
        setLayout(null);
        setVisible(true);
        setTitle("Login");
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
            new Home();
            logarr[0]=userName.getText();
            logarr[1]=contactNum.getText();
            setVisible(false);
        } else if(ae.getSource()==exit){
            setVisible(false);
        }
    }
//    public static void logentry(String args[]) {
//
//        try {
//            //loading
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/data2";
//            String username = "root";
//            String password = "password";
//            Connection connection = DriverManager.getConnection(url, username, password);
//
////here  is data2 name of database, root is username and password is password
////            connection established
//            Statement stmt = connection.createStatement();
//            String query="insert into gentry values (";
//            String Fname=args[0];
//            String number1=args[1];
//            String ending=")";
//            String full=query+Fname+number1+ending;
//            PreparedStatement preparedStatement = connection.prepareStatement(full);
//
//            connection.close();
//        } catch (Exception e) {
//            System.out.println(e);
////        }
//    }


    public static void main(String[] args) {
        new Login();
//        logentry(logarr);

    }
}
