package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainsData {

    @Test( dataProvider = "MySQL-provider")
    // @Test
    public void testTest(String a, String b) {

        System.out.println("The values in the database are: " + a + " " + b );

    }



    @DataProvider(name="MySQL-provider")
    public Object[][] mySQLData() {

        int rowCount = 0;
        int columnCount = 0;
        Object[][] data = null;


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/demodb";
            Connection con = DriverManager.getConnection(url, "andy", "andrew3112");
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from route");
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            columnCount = resultSetMetaData.getColumnCount();

            while (resultSet.next());
                 columnCount++;

            data = new Object[rowCount][columnCount];

            resultSet.beforeFirst();

            for ( int row = 0; row<rowCount; row++){
                resultSet.next();
                for ( int col = 1; col<columnCount; col++)
                    data[row][col-1]= resultSet.getString(col);

            }



             stmt.close();
             con.close();





        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  data;
    }




}
