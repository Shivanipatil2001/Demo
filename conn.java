package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;

    public conn(){
        try{
            Class.forName("com.mysql.cj.JDBC.Driver");
            connection= DriverManager.getConnection("JDBC:mysql//localhost/employeemanagement","shivani","123456789");
             statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
