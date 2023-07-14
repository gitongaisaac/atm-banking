import com.sun.source.tree.WhileLoopTree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.lang.Class.forName;

public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/birthdays";
        String username = "root";
        String password = "My5q! 53rv3r";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from dinners");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getDate(2) +
                        " " + resultSet.getString(3) + " " + resultSet.getString(4) +
                        " " + resultSet.getString(5));
            }

            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
