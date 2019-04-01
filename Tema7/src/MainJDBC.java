import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainJDBC {
    public static void main(String[] args) throws Exception {
//        Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");

//        Connection m_Connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/books", "root", "password");

        Connection m_Connection = JDBC.getConnection(
                "jdbc:mysql://localhost:3306/tema7?user:root&password=password");

        Statement m_Statement = m_Connection.createStatement();
        String query = "SELECT * FROM Tema7";

        ResultSet m_ResultSet = m_Statement.executeQuery(query);

        while (m_ResultSet.next()) {
            System.out.println(m_ResultSet.getString(1) + ", " + m_ResultSet.getString(2) + ", "
                    + m_ResultSet.getString(3));

        }
    }
}
