package dataobjects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SystemDAO {
    public static void insertSystem(Connection conn, TableSystem system) throws SQLException {
        String sql = TableSystem.insertSQL();
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, system.getPrimaryStarId());
            stmt.setString(2, system.getSystemName());
            stmt.setInt(3, system.getHumanHabitability());
            stmt.executeUpdate();
        }
    }
}
