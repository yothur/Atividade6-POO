import java.util.Scanner;

public class Questao37 {

    public static int contadorPrimo(int n1, int n2){
        if (n1 < n2){
            int contTotal = 0;
            for (int i = n1; i <= n2; i++){
                int div = 0;
                for (int j = 1; j <= i ; j++) {
                    if (i % j == 0){
                        div++;
                    }
                }
                if (div == 2){
                    contTotal++;
                }
            }
            return contTotal;
        }else {
            return 0;
        }
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um intervalo para saber quantos números primos tem nele! ");

        System.out.print("Valor 1:");
        int num1 = sc.nextInt();
        System.out.print("Valor 2:");
        int num2 = sc.nextInt();

        System.out.printf("Existem %d números primos no intervalo!", contadorPrimo(num1, num2));
    }
}
