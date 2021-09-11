import java.util.Scanner;

public class    CifrasNumero4Cifras {

    public static void main(String[] args) {
        int numero = 0;
        int unidad;
        int decena;
        int centena;
        int miles;
        int restante;
        String numeroEnCadena;
        boolean bandera = false;

        Scanner t = new Scanner(System.in);

        while (bandera == false){
            System.out.println("Ingrese un número positivo de 4 cifras");
            numero = t.nextInt();
            numeroEnCadena = Integer.toString(numero);
            if(numero > 0 && numeroEnCadena.length() == 4){
                bandera = true;
            }
        }

        unidad = numero % 10;
        restante = numero / 10;
        decena = restante % 10;
        restante /= 10;
        centena = restante % 10;
        restante /= 10;
        miles = restante % 10;

        System.out.println("Unidades: " + unidad);
        System.out.println("Decenas: " + decena);
        System.out.println("Centenas: " + centena);
        System.out.println("Miles: " + miles);
    }
}
