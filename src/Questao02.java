import java.util.Scanner;

public class Questao02 {

    public static int dobro(int valor){
        return valor * 2;
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber o dobro:");
        int num = sc.nextInt();

        System.out.printf("O dobro de %d é %d", num, dobro(num));
    }
}
