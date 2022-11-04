package CodingQuestions;

public class SpeedConvertor {

    public static long milesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);

        }
    }

    public static void conversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("It is an invalid value");
        } else {
            long res = milesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + res + " mi/h");

        }

    }
}
