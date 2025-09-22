import java.util.Scanner;

public class Questao03 {

    public static int maior_menor(int valor1, int valor2){
        if (valor1 > valor2){
            return valor1;
        }else if (valor2 > valor1){
            return valor2;
        }else {
            return valor1;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int num1 = sc.nextInt();

        System.out.println("Digite outro valor:");
        int num2 = sc.nextInt();

        System.out.printf("O maior valor foi %d", maior_menor(num1, num2));
    }
}
