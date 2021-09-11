import java.util.Scanner;

public class ConvertirLongitud {

    public static void main(String[] args) {
        double metros;
        double centimetros;
        double pulgada;
        double pie;
        double yarda;

        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese la longitud en metros");
        metros = t.nextDouble();
        centimetros = metros * 100;
        pulgada = centimetros / 2.54;
        pie = pulgada / 12;
        yarda = pie / 3;

        System.out.println("\nLongitud en centímetros: " + centimetros);
        System.out.println("Longitud en pulgadas: " + pulgada);
        System.out.println("Longitud en pies: " + pie);
        System.out.println("Longitud en yardas: " + yarda);
    }
}
