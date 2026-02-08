package dataobjects;

public class TableDescription {
    private int descriptionId;
    private String content;

    public TableDescription(int descriptionId, String content) {
        this.descriptionId = descriptionId;
        this.content = content;
    }

    // Insert method
    public static String insertSQL() {
        return "INSERT INTO descriptions (content) VALUES (?)";
    }

    // Select method by description_id
    public static java.util.List<TableDescription> selectById(java.sql.Connection conn, int descriptionId) throws java.sql.SQLException {
        String sql = "SELECT * FROM descriptions WHERE descripton_id = ?";
        java.util.List<TableDescription> result = new java.util.ArrayList<>();
        try (java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, descriptionId);
            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result.add(new TableDescription(
                        rs.getInt("descripton_id"),
                        rs.getString("content")
                    ));
                }
            }
        }
        return result;
    }
    // Getters and setters omitted for brevity
}
