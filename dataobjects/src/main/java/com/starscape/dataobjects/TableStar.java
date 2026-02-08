package dataobjects;

public class TableStar {
    private int starId;
    private Integer parentStarId;
    private String starName;
    private String component;
    private String starClass;
    private Double mass;
    private Double temp;
    private Double diameter;
    private Double luminosity;
    private Double mao;
    private Double hzco;
    private Integer orbitParametersId;

    public TableStar(int starId, Integer parentStarId, String starName, String component, String starClass, Double mass, Double temp, Double diameter, Double luminosity, Double mao, Double hzco, Integer orbitParametersId) {
        this.starId = starId;
        this.parentStarId = parentStarId;
        this.starName = starName;
        this.component = component;
        this.starClass = starClass;
        this.mass = mass;
        this.temp = temp;
        this.diameter = diameter;
        this.luminosity = luminosity;
        this.mao = mao;
        this.hzco = hzco;
        this.orbitParametersId = orbitParametersId;
    }

    // Insert method
    public static String insertSQL() {
        return "INSERT INTO stars (parent_star_id, star_name, component, star_class, mass, temp, diameter, luminosity, mao, hzco, orbit_paramers_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    // Select method by star_id
    public static java.util.List<TableStar> selectById(java.sql.Connection conn, int starId) throws java.sql.SQLException {
        String sql = "SELECT * FROM stars WHERE star_id = ?";
        java.util.List<TableStar> result = new java.util.ArrayList<>();
        try (java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, starId);
            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result.add(new TableStar(
                        rs.getInt("star_id"),
                        (Integer)rs.getObject("parent_star_id"),
                        rs.getString("star_name"),
                        rs.getString("component"),
                        rs.getString("star_class"),
                        (Double)rs.getObject("mass"),
                        (Double)rs.getObject("temp"),
                        (Double)rs.getObject("diameter"),
                        (Double)rs.getObject("luminosity"),
                        (Double)rs.getObject("mao"),
                        (Double)rs.getObject("hzco"),
                        (Integer)rs.getObject("orbit_paramers_id")
                    ));
                }
            }
        }
        return result;
    }
    // Getters and setters omitted for brevity
}
