import java.util.Scanner;

public class BytesKbMbGb {

    public static void main(String[] args) {
        long gigabytes;
        long megabytes;
        long kilobytes;
        long bytes;

        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese la capacidad del disco en Gigabytes:");
        gigabytes = t.nextLong();

        megabytes = gigabytes * 1024;
        kilobytes = megabytes * 1024;
        bytes = kilobytes * 1024;

        System.out.println("La capacidad en Gigabytes ingresada fue: " + gigabytes + " Gb" +
                            "\nEn megabytes es: " + megabytes + " Mb" +
                            "\nEn kilobytes es: " + kilobytes + " Kb" +
                            "\nEn bytes es: " + bytes + " bytes");
    }
}
