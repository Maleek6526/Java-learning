package LittleHereAndThere;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example2 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement stmt = null;
        try{
            stmt = connection.prepareStatement("select * from users");
            stmt.execute();
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
        finally {
            try {
                stmt.close();
            }
            catch (SQLException exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
