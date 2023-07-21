import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/atm_banking";
        String username = "isaac";
        String password = "D3F 15@@c 53rv3r";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT SSN, last_name, first_name, email_address, state FROM Person_info");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + "    **********    " + resultSet.getString(2) +
                        "    *********     " + resultSet.getString(3) + "    *********    " + resultSet.getString(4) +
                        "    *********     " + resultSet.getString(5));
            }

            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
