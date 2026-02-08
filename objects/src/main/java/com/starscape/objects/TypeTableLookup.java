package com.starscape.objects;
import java.util.HashMap;
public class TypeTableLookup {
    public TypeTableLookupResult lookup(StarTypeBuilder starTypeBuilder) {
        StarTypeBuilder workingBuilder = new StarTypeBuilder(starTypeBuilder);
        // fiddle with edge cases
        //String st = workingBuilder.getStarType();
        int sn = workingBuilder.getSubtypeNumber();

        if(StarConstants.TYPE_M.equals( workingBuilder.getStarType()) ) {
            if(sn<9 || sn>5) {
                sn = 5;
            }
       
        } else if (sn > 5) {
            sn = 5;
        } else if (sn < 5) {
            sn = 0;
        }
        workingBuilder = new StarTypeBuilder(workingBuilder.getStarType(), workingBuilder.getStarClass(), sn);
        TypeTableLookupResult result = massTable.get(workingBuilder);
        if (result != null) {
            return result;
        } else {
            throw new IllegalArgumentException("Star type not found in lookup table: " + starTypeBuilder.getFullStarType());
        }

    }

    public boolean isValidStarType(StarTypeBuilder starTypeBuilder) {
        TypeTableLookupResult result = massTable.get(starTypeBuilder);
        if (StarTypeBuilder.NULL_STAR_TYPE.equals(starTypeBuilder) || result == null) { 
            return false;
        } else if (result.getMass() == -1 || result.getTemperature() == -1 || result.getDiameter() == -1) {
            return false;
        }
        return true;
    }

    static private HashMap<StarTypeBuilder, TypeTableLookupResult> massTable 
                    = new HashMap<StarTypeBuilder, TypeTableLookupResult>();
    static {
        // Ia
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_IA, 0), new TypeTableLookupResult(200, 50000, 25));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_IA, 5), new TypeTableLookupResult(80, 40000, 22));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_IA, 0), new TypeTableLookupResult(60, 30000, 20));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_IA, 5), new TypeTableLookupResult(30, 15000, 60));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_IA, 0), new TypeTableLookupResult(20, 10000, 120));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_IA, 5), new TypeTableLookupResult(15, 8000, 180));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_IA, 0), new TypeTableLookupResult(13, 7500, 210));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_IA, 5), new TypeTableLookupResult(12, 6500, 280));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_IA, 0), new TypeTableLookupResult(12, 6000, 330));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_IA, 5), new TypeTableLookupResult(13, 5600, 360));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_IA, 0), new TypeTableLookupResult(14, 5200, 420));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_IA, 5), new TypeTableLookupResult(18, 4400, 600));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_IA, 0), new TypeTableLookupResult(20, 3700, 900));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_IA, 5), new TypeTableLookupResult(25, 3000, 1200));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_IA, 9), new TypeTableLookupResult(30, 2400, 1800));
        // Ib
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_IB, 0), new TypeTableLookupResult(150, 50000, 24));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_IB, 5), new TypeTableLookupResult(60, 40000, 20));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_IB, 0), new TypeTableLookupResult(40, 30000, 14));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_IB, 5), new TypeTableLookupResult(25, 15000, 25));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_IB, 0), new TypeTableLookupResult(15, 10000, 50));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_IB, 5), new TypeTableLookupResult(13, 8000, 75));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_IB, 0), new TypeTableLookupResult(12, 7500, 85));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_IB, 5), new TypeTableLookupResult(10, 6500, 115));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_IB, 0), new TypeTableLookupResult(10, 6000, 135));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_IB, 5), new TypeTableLookupResult(11, 5600, 150));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_IB, 0), new TypeTableLookupResult(12, 5200, 180));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_IB, 5), new TypeTableLookupResult(13, 4400, 260));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_IB, 0), new TypeTableLookupResult(15, 3700, 380));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_IB, 5), new TypeTableLookupResult(20, 3000, 600));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_IB, 9), new TypeTableLookupResult(25, 2400, 800));
        // II
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_II, 0), new TypeTableLookupResult(130, 50000, 22));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_II, 5), new TypeTableLookupResult(40, 40000, 18));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_II, 0), new TypeTableLookupResult(30, 30000, 12));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_II, 5), new TypeTableLookupResult(20, 15000, 14));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_II, 0), new TypeTableLookupResult(14, 10000, 30));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_II, 5), new TypeTableLookupResult(11, 8000, 45));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_II, 0), new TypeTableLookupResult(10, 7500, 50));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_II, 5), new TypeTableLookupResult(8, 6500, 66));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_II, 0), new TypeTableLookupResult(8, 6000, 77));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_II, 5), new TypeTableLookupResult(10, 5600, 90));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_II, 0), new TypeTableLookupResult(10, 5200, 110));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_II, 5), new TypeTableLookupResult(12, 4400, 160));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_II, 0), new TypeTableLookupResult(14, 3700, 230));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_II, 5), new TypeTableLookupResult(16, 3000, 350));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_II, 9), new TypeTableLookupResult(18, 2400, 500));
        // III
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_III, 0), new TypeTableLookupResult(110, 50000, 21));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_III, 5), new TypeTableLookupResult(30, 40000, 15));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_III, 0), new TypeTableLookupResult(20, 30000, 10));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_III, 5), new TypeTableLookupResult(10, 15000, 6));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_III, 0), new TypeTableLookupResult(8, 10000, 5));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_III, 5), new TypeTableLookupResult(6, 8000, 5));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_III, 0), new TypeTableLookupResult(4, 7500, 5));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_III, 5), new TypeTableLookupResult(3, 6500, 5));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_III, 0), new TypeTableLookupResult(2.5, 6000, 10));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_III, 5), new TypeTableLookupResult(2.4, 5600, 15));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_III, 0), new TypeTableLookupResult(1.1, 5200, 20));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_III, 5), new TypeTableLookupResult(1.5, 4400, 40));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_III, 0), new TypeTableLookupResult(1.8, 3700, 60));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_III, 5), new TypeTableLookupResult(2.4, 3000, 100));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_III, 9), new TypeTableLookupResult(8, 2400, 200));
        // IV
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_IV, 0), new TypeTableLookupResult(-1, 50000, -1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_IV, 5), new TypeTableLookupResult(-1, 40000, -1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_IV, 0), new TypeTableLookupResult(20, 30000, 8));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_IV, 5), new TypeTableLookupResult(10, 15000, 5));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_IV, 0), new TypeTableLookupResult(4, 10000, 4));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_IV, 5), new TypeTableLookupResult(2.3, 8000, 3));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_IV, 0), new TypeTableLookupResult(2, 7500, 3));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_IV, 5), new TypeTableLookupResult(1.5, 6500, 2));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_IV, 0), new TypeTableLookupResult(1.7, 6000, 3));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_IV, 5), new TypeTableLookupResult(1.2, 5600, 4));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_IV, 0), new TypeTableLookupResult(1.5, 5200, 6));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_IV, 5), new TypeTableLookupResult(-1, 4400, -1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_IV, 0), new TypeTableLookupResult(-1, 3700, -1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_IV, 5), new TypeTableLookupResult(-1, 3000, -1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_IV, 9), new TypeTableLookupResult(-1, 2400, -1));
        // V
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_V, 0), new TypeTableLookupResult(90, 50000, 20));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_V, 5), new TypeTableLookupResult(60, 40000, 12));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_V, 0), new TypeTableLookupResult(18, 30000, 7));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_V, 5), new TypeTableLookupResult(5, 15000, 3.5));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_V, 0), new TypeTableLookupResult(2.2, 10000, 2.2));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_V, 5), new TypeTableLookupResult(1.8, 8000, 2));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_V, 0), new TypeTableLookupResult(1.5, 7500, 1.7));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_V, 5), new TypeTableLookupResult(1.3, 6500, 1.5));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_V, 0), new TypeTableLookupResult(1.1, 6000, 1.1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_V, 5), new TypeTableLookupResult(0.9, 5600, 0.95));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_V, 0), new TypeTableLookupResult(0.8, 5200, 0.9));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_V, 5), new TypeTableLookupResult(0.7, 4400, 0.8));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_V, 0), new TypeTableLookupResult(0.5, 3700, 0.7));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_V, 5), new TypeTableLookupResult(0.16, 3000, 0.2));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_V, 9), new TypeTableLookupResult(0.08, 2400, 0.1));
        // VI
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_VI, 0), new TypeTableLookupResult(2, 50000, 0.18));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_O, StarConstants.CLASS_VI, 5), new TypeTableLookupResult(1.5, 40000, 0.18));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_VI, 0), new TypeTableLookupResult(0.5, 30000, 0.2));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_B, StarConstants.CLASS_VI, 5), new TypeTableLookupResult(0.4, 15000, 0.5));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_VI, 0), new TypeTableLookupResult(-1, 10000, -1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_A, StarConstants.CLASS_VI, 5), new TypeTableLookupResult(-1, 8000, -1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_VI, 0), new TypeTableLookupResult(-1, 7500, -1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_F, StarConstants.CLASS_VI, 5), new TypeTableLookupResult(-1, 6500, -1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_VI, 0), new TypeTableLookupResult(0.8, 6000, 0.8));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_G, StarConstants.CLASS_VI, 5), new TypeTableLookupResult(0.7, 5600, 0.7));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_VI, 0), new TypeTableLookupResult(0.6, 5200, 0.6));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_K, StarConstants.CLASS_VI, 5), new TypeTableLookupResult(0.5, 4400, 0.5));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_VI, 0), new TypeTableLookupResult(0.4, 3700, 0.4));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_VI, 5), new TypeTableLookupResult(0.12, 3000, 0.1));
        massTable.put(new StarTypeBuilder(StarConstants.TYPE_M, StarConstants.CLASS_VI, 9), new TypeTableLookupResult(0.075, 2400, 0.08));
    }

    
}