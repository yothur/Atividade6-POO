import java.util.Scanner;

public class Questao01 {

    public static boolean par_impar(double valor){
        if (valor % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor, se ele for par vai ser [true], se não, [false].");
        double num = sc.nextDouble();

        System.out.println(par_impar(num));

    }
}
