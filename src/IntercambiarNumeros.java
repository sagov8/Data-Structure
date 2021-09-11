import java.util.Scanner;

public class IntercambiarNumeros {

    public static void main(String[] args) {
        int n1, n2, n3;

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        n1 = t.nextInt();
        System.out.println("Ingrese otro número: ");
        n2 = t.nextInt();
        System.out.println("Los números ingresados fueron:" +
                            "\nn1: " + n1 +
                            "\nn2: " + n2);
        n3 = n1;
        n1 = n2;
        n2 = n3;

        System.out.println("Los números intercambiados son:" +
                            "\nn1: " + n1 +
                            "\nn2: " + n2);

    }
}
