package dataobjects;

public class TableRockyObjects {
    private int rockyObjectsId;
    private Integer isBodyOrBeltId;
    private Integer isMoonId;
    private Integer isBeltSignificantBodyId;
    private Integer size;
    private Double diameter;
    private Integer compositDescriptionId;
    private Double density;
    private Double gravity;
    private Double mass;
    private Double escapeVelocity;
    private Integer hydrographicsCode;
    private Double dayLength;
    private Double resourceRating;
    private Double habitabilityRating;

    public TableRockyObjects(int rockyObjectsId, Integer isBodyOrBeltId, Integer isMoonId, Integer isBeltSignificantBodyId, Integer size, Double diameter, Integer compositDescriptionId, Double density, Double gravity, Double mass, Double escapeVelocity, Integer hydrographicsCode, Double dayLength, Double resourceRating, Double habitabilityRating) {
        this.rockyObjectsId = rockyObjectsId;
        this.isBodyOrBeltId = isBodyOrBeltId;
        this.isMoonId = isMoonId;
        this.isBeltSignificantBodyId = isBeltSignificantBodyId;
        this.size = size;
        this.diameter = diameter;
        this.compositDescriptionId = compositDescriptionId;
        this.density = density;
        this.gravity = gravity;
        this.mass = mass;
        this.escapeVelocity = escapeVelocity;
        this.hydrographicsCode = hydrographicsCode;
        this.dayLength = dayLength;
        this.resourceRating = resourceRating;
        this.habitabilityRating = habitabilityRating;
    }

    // Insert method
    public static String insertSQL() {
        return "INSERT INTO rocky_objects (is_body_or_belt_id, is_moon_id, is_belt_significant_body_id, size, diameter, composit_description_id, density, gravity, mass, escape_velocty, hydrographics_code, day_length, resource_rating, habitability_rating) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    }

    // Select method by rocky_objects_id
    public static java.util.List<TableRockyObjects> selectById(java.sql.Connection conn, int rockyObjectsId) throws java.sql.SQLException {
        String sql = "SELECT * FROM rocky_objects WHERE rockey_objects_id = ?";
        java.util.List<TableRockyObjects> result = new java.util.ArrayList<>();
        try (java.sql.PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, rockyObjectsId);
            try (java.sql.ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    result.add(new TableRockyObjects(
                        rs.getInt("rockey_objects_id"),
                        (Integer)rs.getObject("is_body_or_belt_id"),
                        (Integer)rs.getObject("is_moon_id"),
                        (Integer)rs.getObject("is_belt_significant_body_id"),
                        (Integer)rs.getObject("size"),
                        (Double)rs.getObject("diameter"),
                        (Integer)rs.getObject("composit_description_id"),
                        (Double)rs.getObject("density"),
                        (Double)rs.getObject("gravity"),
                        (Double)rs.getObject("mass"),
                        (Double)rs.getObject("escape_velocty"),
                        (Integer)rs.getObject("hydrographics_code"),
                        (Double)rs.getObject("day_length"),
                        (Double)rs.getObject("resource_rating"),
                        (Double)rs.getObject("habitability_rating")
                    ));
                }
            }
        }
        return result;
    }
    // Getters and setters omitted for brevity
}
