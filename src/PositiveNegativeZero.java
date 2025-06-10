public class PositiveNegativeZero {
    public static void checkNumber(int number) {

//        System.out.printf((number > 0) ? "positive" : ((number < 0 ) ? "negative" : "zero"));

        if(number > 0) {
            System.out.println("positive");
        } else if(number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {
        checkNumber(0);
    }
}

