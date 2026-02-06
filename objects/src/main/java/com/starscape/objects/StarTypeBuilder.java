package com.starscape.objects;

public class StarTypeBuilder {
        private String starType;
        private String starClass;
        private int subtypeNumber;

        public StarTypeBuilder(String starType, String starClass, int subtypeNumber) {
            this.starType = starType;
            this.starClass = starClass;
            this.subtypeNumber = subtypeNumber;
        }

        public String getFullStarType() { 
            return starType + subtypeNumber + " " + starClass; 
        }

        public String getStarType() {
            return starType;
        }

        public String getStarClass() {
            return starClass;
        }

        public int getSubtypeNumber() {
            return subtypeNumber;
        }
    }