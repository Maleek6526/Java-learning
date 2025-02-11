package LittleHereAndThere;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Example3 {
    public static void main(String[] args) {

        try(Connection connection = null;){
            PreparedStatement stmt = connection.prepareStatement("select * from users");
            stmt.execute();
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
