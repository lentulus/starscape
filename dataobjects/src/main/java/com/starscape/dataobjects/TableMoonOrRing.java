package dataobjects;

public class TableMoonOrRing {
    private int moonId;
    private int orbitsPlanetId;
    private Integer orbitParametersId;

    public TableMoonOrRing(int moonId, int orbitsPlanetId, Integer orbitParametersId) {
        this.moonId = moonId;
        this.orbitsPlanetId = orbitsPlanetId;
        this.orbitParametersId = orbitParametersId;
    }

    // Insert method
    public static String insertSQL() {
        return "INSERT INTO moon_or_ring (orbits_planet_id, orbit_parameters_id) VALUES (?, ?)";
    }

    // Select method by moon_id
    public static java.util.List<TableMoonOrRing> selectById(java.sql.Connection conn, int moonId) throws java.sql.SQLException {
        String sql = "SELECT * FROM moon_or_ring WHERE moon_id = ?";
        java.util.List<TableMoonOrRing> result = new java.util.ArrayList<>();
        try (java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, moonId);
            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result.add(new TableMoonOrRing(
                        rs.getInt("moon_id"),
                        rs.getInt("orbits_planet_id"),
                        (Integer)rs.getObject("orbit_parameters_id")
                    ));
                }
            }
        }
        return result;
    }
    // Getters and setters omitted for brevity
}
