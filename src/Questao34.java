import java.util.Scanner;

public class Questao34 {

    public static boolean quadradoPerfeito(int n) {
        int cont = 0;
        double raiz = Math.sqrt(n);
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0){
                soma += i;
                cont++;
            }if (cont == raiz){
                break;
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

        System.out.println("Digite um valor pra saber se ele é um quadrado perfeito:");
        int num = sc.nextInt();

        System.out.println(quadradoPerfeito(num));
    }
}
