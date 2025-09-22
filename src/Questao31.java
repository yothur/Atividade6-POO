import java.util.Scanner;

public class Questao31 {

    public static int somaPrimos(int n){
        if (n > 0){
            int divisor = 2;
            int soma = 0;
            while (n != 1){
                if (n % divisor == 0){
                    soma += divisor;
                    n /= divisor;
                }else {
                    divisor++;
                }
            }
            return soma;
        }else {
            return 0;
        }
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um valor:");
        int num = sc.nextInt();

        System.out.printf("A soma dos primos do valor é %d",somaPrimos(num));
    }
}
