package com.starscape.objects;

public class StarFactory {
    // String constants for unique values
    public static final String SPECIAL = "Special";
    public static final String TYPE_M = "M";
    public static final String TYPE_G = "G";
    public static final String TYPE_F = "F";
    public static final String HOT = "Hot";

    public static final String TYPE_A = "A";
    public static final String TYPE_B = "B";
    public static final String TYPE_O = "O";

    public static final String CLASS_VI = "VI";
    public static final String CLASS_IV = "IV";
    public static final String CLASS_III = "III";
    public static final String CLASS_II = "II";
    public static final String CLASS_IB = "Ib";
    public static final String CLASS_IA = "Ia";
    public static final String GIANTS = "Giants";
    public static final String PECULIAR = "Peculiar";
    public static final String TYPE_BD = "BD";
    public static final String D = "D";
    public static final String BLACK_HOLE = "Black Hole";
    public static final String PULSAR = "Pulsar";
    public static final String NEUTRON_STAR = "Neutron Star";
    public static final String NEBULA = "Nebula";
    public static final String PROTOSTAR = "Protostar";
    public static final String STAR_CLUSTER = "Star Cluster";
    public static final String ANOMALY = "Anomaly";
    
    // Arrays initialized with constants
    
    public static final String[] Type = {SPECIAL, TYPE_M, TYPE_M, TYPE_M, TYPE_M, TYPE_M, TYPE_M, TYPE_M, TYPE_G, TYPE_G, TYPE_F, HOT};
    public static final String[] Hot = {TYPE_A, TYPE_A, TYPE_A, TYPE_A, TYPE_A, TYPE_A, TYPE_A, TYPE_A, TYPE_A, TYPE_B, TYPE_B, TYPE_O};
    public static final String[] Special = {CLASS_VI, CLASS_IV, CLASS_VI, CLASS_VI, CLASS_IV, CLASS_IV, CLASS_IV, CLASS_IV, CLASS_III, CLASS_III, GIANTS, GIANTS};
    public static final String[] Unusual = {PECULIAR, CLASS_VI, CLASS_IV, TYPE_BD, TYPE_BD, TYPE_BD, D, D, D, CLASS_III, GIANTS};
    public static final String[] Giants = {CLASS_III, CLASS_III, CLASS_III, CLASS_III, CLASS_III, CLASS_III, CLASS_III, CLASS_II, CLASS_II, CLASS_IB,  CLASS_IA};
    public static final String[] Peculiar = {BLACK_HOLE, PULSAR, NEUTRON_STAR, NEBULA, NEBULA, PROTOSTAR, PROTOSTAR, PROTOSTAR, STAR_CLUSTER, ANOMALY, ANOMALY};
   
    public static Star createPrimaryStar() {
        Star star = new Star();
        star.setStarName(determinePrimaryStarName());
        star.setComponent(determinePrimaryComponent());
        star.setStarClass(determinePrimaryStarClass());
        star.setMass(determinePrimaryMass());
        star.setTemp(determinePrimaryTemp());
        star.setDiameter(determinePrimaryDiameter());
        star.setLuminosity(determinePrimaryLuminosity());
        star.setOrbitNum(determinePrimaryOrbitNum());
        star.setAu(determinePrimaryAu());
        star.setEcc(determinePrimaryEcc());
        star.setPeriod(determinePrimaryPeriod());
        star.setMao(determinePrimaryMao());
        star.setHzco(determinePrimaryHzco());
        return star;
    }

    private static String determinePrimaryStarName() {
        return null;
    }

    private static String determinePrimaryComponent() {
        return "A";
    }

    private static String determinePrimaryStarClass() {
        return "G2V";
    }

    private static double determinePrimaryMass() {
        return 1.0;
    }

    private static double determinePrimaryTemp() {
        return 5778.0;
    }

    private static double determinePrimaryDiameter() {
        return 1.0;
    }

    private static double determinePrimaryLuminosity() {
        return 1.0;
    }

    private static double determinePrimaryOrbitNum() {
        return 1.0;
    }

    private static Double determinePrimaryAu() {
        return 1.0;
    }

    private static Double determinePrimaryEcc() {
        return 0.0;
    }

    private static Double determinePrimaryPeriod() {
        return 365.25;
    }

    private static Double determinePrimaryMao() {
        return 0.0;
    }

    private static Double determinePrimaryHzco() {
        return 1.0;
    }
}
