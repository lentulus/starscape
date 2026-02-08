package dataobjects;

public class TableOrbitParameters {
    private int orbitParameterId;
    private Double orbitNum;
    private Double au;
    private Double ecc;
    private Double period;

    public TableOrbitParameters(int orbitParameterId, Double orbitNum, Double au, Double ecc, Double period) {
        this.orbitParameterId = orbitParameterId;
        this.orbitNum = orbitNum;
        this.au = au;
        this.ecc = ecc;
        this.period = period;
    }

    // Insert method
    public static String insertSQL() {
        return "INSERT INTO orbit_parameters (orbit_num, au, ecc, period) VALUES (?, ?, ?, ?)";
    }

    // Select method by orbit_parameter_id
    public static java.util.List<TableOrbitParameters> selectById(java.sql.Connection conn, int orbitParameterId) throws java.sql.SQLException {
        String sql = "SELECT * FROM orbit_parameters WHERE orbit_parameter_id = ?";
        java.util.List<TableOrbitParameters> result = new java.util.ArrayList<>();
        try (java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orbitParameterId);
            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result.add(new TableOrbitParameters(
                        rs.getInt("orbit_parameter_id"),
                        (Double)rs.getObject("orbit_num"),
                        (Double)rs.getObject("au"),
                        (Double)rs.getObject("ecc"),
                        (Double)rs.getObject("period")
                    ));
                }
            }
        }
        return result;
    }
    // Getters and setters omitted for brevity
}
