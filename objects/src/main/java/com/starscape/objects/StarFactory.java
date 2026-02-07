package com.starscape.objects;

public class PrimaryStarFactory {

    static TypeTableLookup seeker  = new TypeTableLookup();
    public static Star createPrimaryStar() {
        Star star = new Star();

        // Tombstone needs more work here
        star.setStarName(determinePrimaryStarName());
        star.setComponent(determinePrimaryComponent());

        StarTypeBuilder fullStarType = StarTypeBuilder.NULL_STAR_TYPE;
        for (int i = 0; i < 100; i++) {
           
            fullStarType = determinePrimaryStarClass();
            boolean isValid = seeker.isValidStarType(fullStarType);
            if(isValid){
                break;
            }

        }
        if(fullStarType.equals(StarTypeBuilder.NULL_STAR_TYPE)) {
            throw new IllegalStateException("Failed to determine a valid star type after 100 attempts");
        }



        star.setStarClass(fullStarType.getFullStarType());

        TypeTableLookupResult typeResult = seeker.lookup(fullStarType);
        if(typeResult == null) {
            throw new IllegalStateException("TypeTableLookup returned null for star type: " + fullStarType.getFullStarType());
        }
        
        star.setMass(typeResult.getMass());
        star.setTemp(typeResult.getTemperature());
        star.setDiameter(typeResult.getDiameter());

        star.setLuminosity(determinePrimaryLuminosity(typeResult.getDiameter(), typeResult.getTemperature()));
        star.setOrbitNum(determinePrimaryOrbitNum());
        star.setAu(determinePrimaryAu());
        star.setEcc(determinePrimaryEcc());
        star.setPeriod(determinePrimaryPeriod());
        star.setMao(determinePrimaryMao());
        star.setHzco(determinePrimaryHzco());
        star.setParentStar(null); // primary stars have no parent
        return star;
    }

    private static String determinePrimaryStarName() {

        return null;
    }

     private static String determinePrimaryComponent() {
        return "A";
    }

    private static StarTypeBuilder determinePrimaryStarClass() {
        String starType = StarConstants.Type[Dice.roll2D6() - 2];
        String starClass = StarConstants.CLASS_V;

        if(StarConstants.SPECIAL.equals(starType)) {
            int typeReroll = Dice.roll2D6() - 2;
            if (typeReroll == 0) {
                typeReroll = 1;
            } else if (typeReroll == 10) {
                typeReroll = 9;
            }
            starType = StarConstants.Type[typeReroll];
            starClass = StarConstants.Special[Dice.roll2D6() - 2];
            if(StarConstants.GIANTS.equals(starClass)) {
                starClass = StarConstants.Giants[Dice.roll2D6() - 2];
            }
        } else if(StarConstants.HOT.equals(starType)) {
            starType = StarConstants.Hot[Dice.roll2D6() - 2];
        }

        int subtypeNumber = Dice.roll1D10() - 1; // Subtype from 0 to 9

        return new StarTypeBuilder(starType, starClass, subtypeNumber);
    }



    private static double determinePrimaryLuminosity(double diameter, double temperature) {
        // Simple Stefan–Boltzmann-inspired proportional estimate.
        double tempSols = temperature / 5778.0; // Sun's effective temperature in K 
        return Math.pow(diameter, 2) * Math.pow(tempSols, 4);
    }

    private static double determinePrimaryOrbitNum() {
        return 0; // primary is always 0
    }

    private static Double determinePrimaryAu() {
        return null;
    }

    private static Double determinePrimaryEcc() {
        return null;
    }

    private static Double determinePrimaryPeriod() {
        return null;
    }

    private static Double determinePrimaryMao() {
        return null;
    }

    private static Double determinePrimaryHzco() {
        return null; // the Habitable Zone Centre Orbit
    }
}
