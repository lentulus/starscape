package com.starscape.objects;

    

    public class StarTypeBuilder {
        private String starType;
        private String starClass;
        private int subtypeNumber;

        public static final StarTypeBuilder NULL_STAR_TYPE = new StarTypeBuilder("NULL", "NULL", 0);

        public StarTypeBuilder(String starType, String starClass, int subtypeNumber) {
            this.starType = starType;
            this.starClass = starClass;
            this.subtypeNumber = subtypeNumber;
        }

        public StarTypeBuilder(StarTypeBuilder other) {
            this.starType = other.starType;
            this.starClass = other.starClass;
            this.subtypeNumber = other.subtypeNumber;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            StarTypeBuilder that = (StarTypeBuilder) o;
            if (subtypeNumber != that.subtypeNumber) return false;
            if (starType != null ? !starType.equals(that.starType) : that.starType != null) return false;
            return starClass != null ? starClass.equals(that.starClass) : that.starClass == null;
        }

        @Override
        public int hashCode() {
            int result = starType != null ? starType.hashCode() : 0;
            result = 31 * result + (starClass != null ? starClass.hashCode() : 0);
            result = 31 * result + subtypeNumber;
            return result;
        }

        @Override
        public String toString() {
            return "StarTypeBuilder{" +
                    "starType='" + starType + '\'' +
                    ", starClass='" + starClass + '\'' +
                    ", subtypeNumber=" + subtypeNumber +
                    '}';
        }

    }