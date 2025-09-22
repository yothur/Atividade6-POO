import java.util.Scanner;

public class Questao17 {

    public static boolean numeroPerfeito(int n){
        int soma = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                soma += i;
            }
        }
        if (soma == n){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número, se for perfeito [true], se não, [false]");
        int num = sc.nextInt();

        System.out.println(numeroPerfeito(num));
    }
}
