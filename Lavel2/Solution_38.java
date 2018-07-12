package Lavel2;

public class Solution_38 {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double fahrenheit = 9 / 5.0 * celsium + 32;
        return fahrenheit;
    }
}
