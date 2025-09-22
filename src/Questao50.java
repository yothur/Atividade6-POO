import java.util.Scanner;

public class Questao50 {

    public static boolean amigos(int n1, int n2){
        int soma1 = 0;
        int soma2 = 0;
        for (int i = 1; i <= n1; i++){
            if (n1 % i == 0){
                soma1 += i;
            }
        }
        for (int i = 1; i <= n2; i++){
            if (n2 % i == 0){
                soma2 += i;
            }
        }
        if (soma1 == soma2){
            return true;
        }else {
            return false;
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite 2 valores, se eles fores amigos[true], se não [false]");

        System.out.println("Valor 1: ");
        int num1 = sc.nextInt();

        System.out.println("Valor 2: ");
        int num2 = sc.nextInt();

        System.out.println(amigos(num1, num2));



    }
}
