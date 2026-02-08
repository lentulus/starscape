
package com.starscape.objects;

public class PrimaryStarFactory extends StarFactory {

    @Override
    public Star createStar() {
        return super.createStar();
    }

    @Override
    protected String determineStarName() {
        return null;
    }

    @Override
    protected String determineComponent() {
        return "A";
    }

    @Override
    protected StarTypeBuilder determineStarClass() {
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

    // The rest use the base implementation
}
