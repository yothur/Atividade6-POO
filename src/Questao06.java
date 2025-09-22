import java.util.Scanner;

public class Questao06 {

    public static int soma(int n){
        int soma = 0;
        for (int i = 1; i <= n; i++){
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        System.out.printf("A soma de todos os valores até %d é %d", num, soma(num));
    }
}
