import java.util.Scanner;

public class tipodedato {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        char caracter = scanner.next().charAt(0);

        if (Character.isLetter(caracter)) {
            if (Character.isUpperCase(caracter)) {
                System.out.println("Es una letra mayúscula.");
            } else {
                System.out.println("Es una letra minúscula.");
            }
        } else if (Character.isDigit(caracter)) {
            System.out.println("Es un número.");
        } else {
            System.out.println("No es ni una letra ni un número.");
        }
    }
}

