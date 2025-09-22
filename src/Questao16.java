import java.util.Scanner;

public class Questao16 {

    public static double fahrenheit(double c){
        return (c * 1.8) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius:");
        double celsius = sc.nextDouble();

        System.out.printf("%.0f°C equivale á %.0f°F ", celsius, fahrenheit(celsius));
    }
}
