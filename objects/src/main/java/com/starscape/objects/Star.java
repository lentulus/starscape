package com.starscape.objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Star {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String starName; // may be null
    private String component;
    private String starClass;
    private double mass;
    private double temp;
    private double diameter;
    private double luminosity;
    private double orbitNum;
    private Double au; // may be null
    private Double ecc; // may be null eccentricty
    private Double period; // may be null
    private Double mao; // may be null Minimum Allowable Orbit#
    private Double hzco; // may be null the Habitable Zone Centre Orbit
    private Star parentStar; // may be null for primary stars

    public Star() {}

    public Long getId() { return id; }

    public String getStarName() { return starName; }
    public void setStarName(String starName) { this.starName = starName; }

    public String getComponent() { return component; }
    public void setComponent(String component) { this.component = component; }

    public String getStarClass() { return starClass; }
    public void setStarClass(String starClass) { this.starClass = starClass; }

    public double getMass() { return mass; }
    public void setMass(double mass) { this.mass = mass; }

    public double getTemp() { return temp; }
    public void setTemp(double temp) { this.temp = temp; }

    public double getDiameter() { return diameter; }
    public void setDiameter(double diameter) { this.diameter = diameter; }

    public double getLuminosity() { return luminosity; }
    public void setLuminosity(double luminosity) { this.luminosity = luminosity; }

    public double getOrbitNum() { return orbitNum; }
    public void setOrbitNum(double orbitNum) { this.orbitNum = orbitNum; }

    public Double getAu() { return au; }
    public void setAu(Double au) { this.au = au; }

    public Double getEcc() { return ecc; }
    public void setEcc(Double ecc) { this.ecc = ecc; }

    public Double getPeriod() { return period; }
    public void setPeriod(Double period) { this.period = period; }

    public Double getMao() { return mao; }
    public void setMao(Double mao) { this.mao = mao; }

    public Double getHzco() { return hzco; }
    public void setHzco(Double hzco) { this.hzco = hzco; }

    public Star getParentStar() { return parentStar; }
    public void setParentStar(Star parentStar) { this.parentStar = parentStar; }
}
