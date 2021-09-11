import java.util.Scanner;

public class TiempoRestanteHHMMSS {

    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        int horasRestantes;
        int minutosRestantes;
        int segundosRestantes;

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese la hora HH:");
        horas = t.nextInt();
        System.out.println("Ingrese los minutos MM:");
        minutos = t.nextInt();
        System.out.println("Ingrese los segundos SS:");
        segundos = t.nextInt();
        System.out.println("La hora ingresada en formato HH:MM:SS es: " +
                            horas+":"+minutos+":"+segundos);

        horasRestantes = 23 - horas;
        minutosRestantes = 59 - minutos;
        segundosRestantes = 60 - segundos;

        if(segundosRestantes == 60 && minutosRestantes == 59){
            segundosRestantes = 0;
            minutosRestantes = 0;
            horasRestantes += 1;
        }

        System.out.println("El tiempo restante para finalizar el día es:" +
                            "\n" +horasRestantes+" horas" +
                            "\n" + minutosRestantes + " minutos" +
                            "\n" + segundosRestantes + " segundos");
    }
}
