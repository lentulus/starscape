package com.starscape.objects;

public class StarFactory {
    public static Star createPrimaryStar() {
        Star star = new Star();
        star.setStarName("DummyStar");
        star.setComponent("A");
        star.setStarClass("G2V");
        star.setMass(1.0);
        star.setTemp(5778.0);
        star.setDiameter(1.0);
        star.setLuminosity(1.0);
        star.setOrbitNum(1.0);
        star.setAu(1.0);
        star.setEcc(0.0);
        star.setPeriod(365.25);
        star.setMao(0.0);
        star.setHzco(1.0);
        return star;
    }
}
