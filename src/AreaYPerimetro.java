import java.util.Scanner;

public class AreaYPerimetro {
    public static void main(String[] args) {
        double altura;
        double base;
        double area;
        double perimetro;

        Scanner t = new Scanner(System.in);
        System.out.println("Digite la altura del rectángulo");
        altura = t.nextDouble();
        System.out.println("Digite la base del rectángulo");
        base = t.nextDouble();

        area = base * altura;
        perimetro = (base + altura) * 2;

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perimetro del rectángulo es: " + perimetro);
    }
}
