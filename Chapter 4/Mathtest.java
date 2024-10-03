public class Mathtest {
    public static void main(String[] args) {
        double sqrtValue = Math.random() * 100; // generate a random value between 0 and 100
        double sinValue = Math.random() * 2 * Math.PI; // generate a random angle in radians
        double cosValue = sinValue; // use the same angle for cosine
        double floorCeilValue = Math.random() * 100; // generate a random value between 0 and 100
        double roundValue = floorCeilValue; // use the same value for rounding
        int maxValue = (int) (Math.random() * 100); // generate a random integer between 0 and 100
        int minValue = (int) (Math.random() * 100); // generate another random integer between 0 and 100

        System.out.println("SQRT: " + Math.sqrt(sqrtValue));
        System.out.println("SIN: " + Math.sin(sinValue));
        System.out.println("COS: " + Math.cos(cosValue));
        System.out.println("FLOOR: " + Math.floor(floorCeilValue));
        System.out.println("CEIL: " + Math.ceil(floorCeilValue));
        System.out.println("ROUND: " + Math.round(roundValue));
        System.out.println("MAX: " + Math.max(maxValue, minValue));
        System.out.println("MIN: " + Math.min(maxValue, minValue));
        System.out.println("RANDOM: " + (Math.random() * 20 + 10));
    }
}