//import java.sql.*;
//public class Mysqlall {
//    public static void main(String args[]) {
//        try {
//            //loading
//            Class.forName("com.mysql.jdbc.Driver");
//             String url ="jdbc:mysql://localhost:3306/data2";
//             String username = "root";
//             String password = "password";
//             Connection connection = DriverManager.getConnection(url,username,password);
//
//
////here  is data2 name of database, root is username and password is password
////            connection established
//
//            Statement stmt = connection.createStatement();
//            String query="insert into gentry values (";
//            String Fname=args[0];
//            String number1=args[1];
//            String ending=")";
//            String full=query+Fname+number1+ending;
//            PreparedStatement preparedStatement = connection.prepareStatement(full);
//            connection.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}
