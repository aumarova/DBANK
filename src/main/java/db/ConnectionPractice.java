package db;

import javax.xml.transform.Result;
import java.sql.*;

public class ConnectionPractice {

    public static void main(String[] args) throws SQLException {

        String jdbcLink = "jdbc:mysql://3.131.35.165:3306/digitalbank?user=dbank&password=SDET123$$";

        // Step 1: establish connection

        String query = "SELECT * FROM users";
        Connection connection = DriverManager.getConnection(jdbcLink);

        // Step 2: create statement
        Statement statement = connection.createStatement();

        // Step 3: send a query
        ResultSet resultSet = statement.executeQuery(query);
//        resultSet.next();
//        System.out.println(resultSet.getString(1)); //returns 4 - from column id
//
//        System.out.println(resultSet.getString(6));
//
//        System.out.println(resultSet.getString(7));
//
//
//        System.out.println(resultSet.getString(8));
//        System.out.println(resultSet.getString("username"));

        // createStatement() is used to create statements

        // resultSet is returned by statement.executeQuery(query)
        // ResultSet is an Interface that helps us with the query. Result Set has a data type specific getters method.
        //

        while(resultSet.next()){
            // Processing the Result Set
            System.out.println(resultSet.getString("username"));
            System.out.println(resultSet.getInt("id"));
        }
        // step 4: close the connection
        resultSet.close();
        statement.close();
        connection.close(); // when connection is closed statement and result is closed automatically




    }
}
