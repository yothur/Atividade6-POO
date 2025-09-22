import java.util.Scanner;

public class Questao15 {

    public static int fibonacci(int n){
        int inicio = 0;
        int meio = 1;
        int proximo = inicio + meio;
        int cont = 0;
        System.out.printf("%d -> %d -> ", meio, proximo);
        while (cont <= n-3){
            inicio = meio;
            meio = proximo;
            proximo = inicio + meio;
            System.out.printf("%d -> ", proximo);
            cont++;
        }
        return proximo;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual termo da sequência Fibonacci você que ver?");
        int termos = sc.nextInt();

        System.out.printf("\nO %d° termo da sequência Fibonacci é %d", termos, fibonacci(termos));
    }
}
