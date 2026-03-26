package oracle;

import java.sql.*;

public class ConnectOracle {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=daporat2c)(Port=29362))(CONNECT_DATA=(SID=darc1l11)))";
        String user = "darssvc";
        String password = "dpt~Aug2020";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "begin darsadm.dars_sr_bph_surgery_java_v3(201812,0,999,'Y'); end;";
            Statement stmt = conn.createStatement();
            stmt.executeQuery(sql);
            if (stmt.getMoreResults()) {
                ResultSet rs = stmt.getResultSet();
                System.out.println("ResultSet");
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
            }
            System.out.println("Stored procedure called successfully.");
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error calling stored procedure: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}