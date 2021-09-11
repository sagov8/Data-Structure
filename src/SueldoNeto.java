import java.util.Scanner;

public class SueldoNeto {

    public static void main(String[] args) {
        int ventaUno;
        int ventaDos;
        int ventaTres;
        double totalVendido;
        double SUELDOBASICO = 480000;
        double sueldoNeto;

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese el valor de la venta No.1:");
        ventaUno = t.nextInt();
        System.out.println("Ingrese el valor de la venta No.2:");
        ventaDos = t.nextInt();
        System.out.println("Ingrese el valor de la venta No.3:");
        ventaTres = t.nextInt();

        totalVendido = ventaUno + ventaDos + ventaTres;

        sueldoNeto = ( totalVendido * 0.12 ) + SUELDOBASICO;

        System.out.println("El sueldo neto del empleado es: $" + sueldoNeto);
    }
}
