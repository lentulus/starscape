package com.starscape.objects;

public class StarFactory {

  /*   public static class StarTypeBuilder {
        public static final StarTypeBuilder NULL_STAR_TYPE = new StarTypeBuilder("NULL NULL", "NULL", 0);
        private final String fullStarType;

        public StarTypeBuilder(String fullStarType) {
            this.fullStarType = fullStarType;
        }

        public String getFullStarType() {
            return fullStarType;
        }
    } */



    public Star createStar() {
        TypeTableLookup seeker = new TypeTableLookup();
        Star star = new Star();
        star.setStarName(determineStarName());
        star.setComponent(determineComponent());
        StarTypeBuilder fullStarType = StarTypeBuilder.NULL_STAR_TYPE;
        for (int i = 0; i < 100; i++) {
            fullStarType = determineStarClass();
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
        star.setLuminosity(determineLuminosity(typeResult.getDiameter(), typeResult.getTemperature()));
        star.setOrbitNum(determineOrbitNum());
        star.setAu(determineAu());
        star.setEcc(determineEcc());
        star.setPeriod(determinePeriod());
        star.setMao(determineMao());
        star.setHzco(determineHzco());
        star.setParentStar(null); // default for base
        return star;
    }

    protected String determineStarName() {
        return null;
    }

    protected String determineComponent() {
        return null;
    }

    protected StarTypeBuilder determineStarClass() {
        return StarTypeBuilder.NULL_STAR_TYPE;
    }

    protected double determineLuminosity(double diameter, double temperature) {
        double tempSols = temperature / 5778.0;
        return Math.pow(diameter, 2) * Math.pow(tempSols, 4);
    }

    protected double determineOrbitNum() {
        return 0;
    }

    protected Double determineAu() {
        return null;
    }

    protected Double determineEcc() {
        return null;
    }

    protected Double determinePeriod() {
        return null;
    }

    protected Double determineMao() {
        return null;
    }

    protected Double determineHzco() {
        return null;
    }
}
