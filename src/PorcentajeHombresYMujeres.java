import java.util.Scanner;

public class PorcentajeHombresYMujeres {

    public static void main(String[] args) {
        int cantidadHombres;
        int cantidadMujeres;
        int total;
        double porcentajeHombres;
        double porcentajeMujeres;

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de hombres del salón: ");
        cantidadHombres = t.nextInt();
        System.out.println("Ingrese la cantidad de mujeres del salón: ");
        cantidadMujeres = t.nextInt();

        total = cantidadHombres + cantidadMujeres;
        porcentajeHombres = ( cantidadHombres * 100 ) / total;
        porcentajeMujeres = 100 - porcentajeHombres;

        System.out.println("El porcentaje de hombres es: " + porcentajeHombres + "%");
        System.out.println("El porcentaje de mujeres es: " + porcentajeMujeres + "%");
    }
}
