package dataobjects;

public class TableBodyOrBelt {
    private int bodyOrBeltId;
    private int orbitsStarId;
    private int orbitParametersId;

    public TableBodyOrBelt(int bodyOrBeltId, int orbitsStarId, int orbitParametersId) {
        this.bodyOrBeltId = bodyOrBeltId;
        this.orbitsStarId = orbitsStarId;
        this.orbitParametersId = orbitParametersId;
    }

    // Insert method
    public static String insertSQL() {
        return "INSERT INTO body_or_belt (orbits_star_id, orbit_parameters_id) VALUES (?, ?)";
    }

    // Select method by body_or_belt_id
    public static java.util.List<TableBodyOrBelt> selectById(java.sql.Connection conn, int bodyOrBeltId) throws java.sql.SQLException {
        String sql = "SELECT * FROM body_or_belt WHERE body_or_belt_id = ?";
        java.util.List<TableBodyOrBelt> result = new java.util.ArrayList<>();
        try (java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, bodyOrBeltId);
            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result.add(new TableBodyOrBelt(
                        rs.getInt("body_or_belt_id"),
                        rs.getInt("orbits_star_id"),
                        rs.getInt("orbit_parameters_id")
                    ));
                }
            }
        }
        return result;
    }
    // Getters and setters omitted for brevity
}
