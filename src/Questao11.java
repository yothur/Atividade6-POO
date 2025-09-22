import java.util.Scanner;

public class Questao11 {

    public static double mdc(double a, double b) {
        while (b != 0){
            double resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor1 = sc.nextInt();

        System.out.println("Digite outro valor;");
        double valor2 = sc.nextInt();

        System.out.printf("O MDC entre %.1f e %.1f é %.1f", valor1, valor2, mdc(valor1, valor2));
    }
}
