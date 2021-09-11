import java.util.Scanner;

public class TransformarTemperatura {

    public static void main(String[] args) {
        double farenheit;
        double celsius;

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el valor en grados Farenheit: ");
        farenheit = t.nextInt();
        celsius = ( farenheit - 32 ) * 5 / 9;
        System.out.println("La temperatura en grados Celsius es: " + celsius + "°");

        System.out.println("Ingrese el valor en grados Celcius:");
        celsius = t.nextInt();
        farenheit = ( celsius * 9 / 5 ) + 32;
        System.out.println("La temperatura en grados Farenheit es: " + farenheit + "°");
    }
}
