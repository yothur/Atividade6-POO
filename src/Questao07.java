import java.util.Scanner;

public class Questao07 {

    public static int fatorial(int n){
        int mult = 1;
        for (int i = n; i >= 1; i--){
            mult *= i;
            System.out.printf("%d x ",i);
        }
        return mult;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        System.out.printf("\nO fatorial de %d é %d", num, fatorial(num));
    }
}
