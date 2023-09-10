
    import java.util.Scanner;
    public class calculoimc {
        public static void main(String[] args) {
            Scanner lector = new Scanner(System.in);
            double peso,estatura,calculo=0;
            System.out.println("Para conocer tu IMC debes ingresar los siguientes datos:");
            System.out.print("Peso (kg):");
            peso = lector.nextDouble();
            System.out.print("estatura (m):");
            estatura = lector.nextDouble();
            if ( estatura !=0 && peso !=0) {
                calculo = peso / (estatura * estatura);
                if (calculo < 18.5)
                    System.out.println("Usted tiene bajo peso.");
                else if (calculo >= 18.555 && calculo <= 24.999)
                    System.out.println("Usted se encuentra en estado normal.");
                else if (calculo >= 25.000 && calculo <= 29.999)
                    System.out.println("Usted tiene sobrepeso ciudese.");
                else if (calculo >= 30.000)
                    System.out.println("Alerta actualmente tiene obesidad.");
            } else
                System.out.print("Los datos ingresados no son validos.");
        }
    }

