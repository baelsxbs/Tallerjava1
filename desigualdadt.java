import java.util.Scanner;
public class desigualdadt {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double a, b, c = 0;
        System.out.println("Ingrese los tres lados a,b y c de un triángulo deben satisfacer la desigualdad triangular");
        System.out.print("a = ");
        a = lector.nextDouble();
        System.out.print("b = ");
        b = lector.nextDouble();
        System.out.print("c = ");
        c = lector.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c && c == a) {
                System.out.println("El triángulo es equilatero.");
            } else if (a == b || a == c || b == c) {
                System.out.print("El triángulo es isósceles.");
            } else if (a != b && a != c && b != c) {
                System.out.print("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Las medidas ingresadas del triángulo no cumplen la desigualdad triangular.");
        }
    }
}

