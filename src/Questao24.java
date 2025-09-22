import java.util.Scanner;

public class Questao24 {

    public static int potenciar(int n1, int n2){
        int aux = 1;
        for (int i = 1; i <= n2; i++){
            aux *= n1;
        }
        return aux;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do número: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o seu expoente: ");
        int valor2 = sc.nextInt();

        System.out.printf("O número %d elevado á %d é igual a: [%d]!", valor1, valor2, potenciar(valor1, valor2));
    }
}
