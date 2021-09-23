package db;

import org.junit.experimental.results.ResultMatchers;

import java.sql.*;

public class MetaDataPractice {

    public static void main(String[] args) throws SQLException {

        String jdbcLink = "jdbc:mysql://3.131.35.165:3306/digitalbank?user=dbank&password=SDET123$$";

        Connection connection = DriverManager.getConnection(jdbcLink);

        Statement statement = connection.createStatement();

        // execute the query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM account;");

        // get metaData from resultSet
        ResultSetMetaData metaData = resultSet.getMetaData();

        // use total column count in order to loop
        int columnCount = metaData.getColumnCount();

        // loop using index
        for (int i = 1; i <= columnCount; i++) {

            System.out.println(metaData.getColumnName(i));
        }
    }
}
