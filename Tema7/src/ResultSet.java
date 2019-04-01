import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet {
//    public static void main(String[] args) {
//
//        Connection connection = JDBC.getConnection(
//                "mysql",
//                "localhost",
//                "3306",
//                "books",
//                "root",
//                "password");
//
//        if (conn = null) return;
//        Statement st = null;
//        java.sql.ResultSet rs = null;
//        final String format = "%20s%20s%12s\n";
//        try {
//            st = conn.createStatemnt(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_READ_ONLY);
//            rs = st.executeQuery("select*from authors");
//            boolean hasResults = rs.next();
//            if (hasResults) {
//                System.out.format(format, "Name", "Email", "Birthday");
//                do {
//                    System.out.format(format, rs.getString("name"), rs.getString("email"), rs.getDate("birthday"));
//                } while (rs.next());
//            } else {
//                System.out.println("No result");
//            }
//        } catch (
//                SQLException e) {
//            System.err.println("Cannot execute query:" + e.getMessage());
//        } finally {
//            if (rs != null) try {
//                rs.close();
//            } catch (SQLException e) {
//            }
//            if (st != null) try {
//                st.close();
//            } catch (SQLException e) {
//            }
////            try {
////                connection.close();
////            } catch (SQLException e) {
////            }
//        }
//    }
}