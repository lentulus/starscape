package dataobjects;
import com.starscape.dataobjects.DatabaseUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class SystemService {
    public static List<TableSystem> getSystemsById(int systemId) throws SQLException {
        try (Connection conn = DatabaseUtil.getConnection()) {
            return TableSystem.selectById(conn, systemId);
        }
    }

    public static void addSystem(TableSystem system) throws SQLException {
        try (Connection conn = DatabaseUtil.getConnection()) {
            SystemDAO.insertSystem(conn, system);
        }
    }
}
