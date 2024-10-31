public class ConversionTemperature {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(args[0]);
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.println("Temperature passee en degres Celsius : " + celsius);
        System.out.println(celsius + " degres Celsius equivalent à " + fahrenheit + " degres Fahrenheit.");

    }
}
