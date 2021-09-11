import java.util.Scanner;

public class IntercambioUnidadEntre2Numeros {

    public static void main(String[] args) {
        int n1, n2;
        String numUno, numDos, unidadUno, unidadDos;

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese un número natural");
        n1 = t.nextInt();
        System.out.println("Ingrese otro número natural");
        n2 = t.nextInt();
        System.out.println("Los números ingresados fueron: " + n1 + ", " + n2);

        unidadUno = String.valueOf(n1 % 10);
        n1 /= 10;
        unidadDos = String.valueOf(n2 % 10);
        n2 /= 10;
        numUno = String.valueOf(n1) + unidadDos;
        numDos = String.valueOf(n2) + unidadUno;

        System.out.println("Los nuevos números son: " + numUno + ", " + numDos);
    }
}
