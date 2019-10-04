package stqa;


import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_ConnectionTest {
    @Test
    public void testGroupCreation()  {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook?user=root&password=password"+
                    "useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false");

            // Do something with the Connection

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }

    //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook?user=root&password=");

}