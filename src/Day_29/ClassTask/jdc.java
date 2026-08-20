package Day_29.ClassTask;
import java.sql.*;
public class jdc {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://<host>:<port>/<db_name>";
        String user = "root";
        String password = "KEERTHANA0809";
        Connection con = DriverManager.getConnection(url,user,password);
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery("SELECT * FROM student");

        while(rs.next()){
            System.out.println(rs.getInt("id")+" " +
                    rs.getString("name")+" "+
                    rs.getString("Department")+ " "+ rs.getInt("age"));
        }
        rs.close();
        st.close();
        con.close();
    }
}
