package dataobjects;

public class TableSystem {
    private int systemId;
    private int primaryStarId;
    private String systemName;
    private int humanHabitability;

    public TableSystem(int systemId, int primaryStarId, String systemName, int humanHabitability) {
        this.systemId = systemId;
        this.primaryStarId = primaryStarId;
        this.systemName = systemName;
        this.humanHabitability = humanHabitability;
    }

    // Insert method
    public static String insertSQL() {
        return "INSERT INTO systems (primary_star_id, system_name, human_habitability) VALUES (?, ?, ?)";
    }

    // Select method by system_id
    public static java.util.List<TableSystem> selectById(java.sql.Connection conn, int systemId) throws java.sql.SQLException {
        String sql = "SELECT * FROM systems WHERE system_id = ?";
        java.util.List<TableSystem> result = new java.util.ArrayList<>();
        try (java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, systemId);
            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result.add(new TableSystem(
                        rs.getInt("system_id"),
                        rs.getInt("primary_star_id"),
                        rs.getString("system_name"),
                        rs.getInt("human_habitability")
                    ));
                }
            }
        }
        return result;
    }

    // Getters and setters
    public int getSystemId() { return systemId; }
    public void setSystemId(int systemId) { this.systemId = systemId; }
    public int getPrimaryStarId() { return primaryStarId; }
    public void setPrimaryStarId(int primaryStarId) { this.primaryStarId = primaryStarId; }
    public String getSystemName() { return systemName; }
    public void setSystemName(String systemName) { this.systemName = systemName; }
    public int getHumanHabitability() { return humanHabitability; }
    public void setHumanHabitability(int humanHabitability) { this.humanHabitability = humanHabitability; }
}
