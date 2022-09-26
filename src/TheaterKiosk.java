public class TheaterKiosk {
    public static void main(String[] args) {

        int age = 19;
        int REQUIRED_AGE = 21;

        System.out.println("Please enter your age");

        if (age >= REQUIRED_AGE) {
            System.out.println("You get a wristband, please be responsible");
        }else if (age < REQUIRED_AGE) {
            System.out.println("");
        }
    }
}
