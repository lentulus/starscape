package com.starscape.objects;

public final class StarConstants {
    private StarConstants() {}

    // String constants for unique values
    public static final String SPECIAL = "Special";
    public static final String TYPE_M = "M";
    public static final String TYPE_G = "G";
    public static final String TYPE_F = "F";
    public static final String HOT = "Hot";

    public static final String TYPE_A = "A";
    public static final String TYPE_B = "B";
    public static final String TYPE_O = "O";
        public static final String TYPE_K = "K";

    public static final String CLASS_VI = "VI";
    public static final String CLASS_IV = "IV";
    public static final String CLASS_V = "V";
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
}
