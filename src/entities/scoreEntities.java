package entities;

public class scoreEntities {

        public String name;
        public double score1;
        public double score2;
        public double score3;

        public double finalScore() {
            double finalScore = score1 + score2 + score3;
            return  finalScore;
        }

        public String finalPass() {
            if (finalScore() >= 60) {
                return "PASS";
            }
            else {
                return "FAILED, MISSING " + (60 - finalScore()) + " POINTS";
            }
        }

        
    
}
