import java.util.Scanner;

public class DonacionesPesoYDolar {
    public static void main(String[] args) {
        long donacionDolares;
        long donacionEuros;
        long donacionEnPesos;
        long porcentajeCentroSalud;
        long porcentajeComedor;
        long porcentajeGastosAdmin;
        long restante;

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese la donación en dólares:");
        donacionDolares = t.nextInt();
        System.out.println("Ingrese la donación en donacionEuros:");
        donacionEuros = t.nextInt();

        donacionEnPesos = (donacionDolares * 2000) + (donacionEuros * 2800);
        porcentajeCentroSalud = (long) (donacionEnPesos * 0.5);
        porcentajeComedor = (long) (donacionEnPesos * 0.3);
        porcentajeGastosAdmin = (long) (donacionEnPesos * 0.2);

        System.out.println("El porcentaje destinado para el centro de salud es: $" + porcentajeCentroSalud);
        System.out.println("El porcentaje destinado al Comedor es: $" + porcentajeComedor);
        System.out.println("El porcentaje destinado para Gastos Administrativos es: $" + porcentajeGastosAdmin);
    }
}
