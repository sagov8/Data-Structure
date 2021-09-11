import java.util.Scanner;

public class ConvertirSegundosAHHMMSS {

    public static void main(String[] args) {
        int segundos;
        int horas;
        int minutos;
        int restante;

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese una cantidad en segundos:");
        segundos = t.nextInt();

        horas = segundos / 3600;
        restante = segundos % 3600;
        minutos = restante / 60;
        restante %= 60;

        System.out.println("La hora en formato HH:MM:SS es: "
                + horas + " hora " + minutos + " minuto y " +
                 restante + " segundos.");

    }
}
