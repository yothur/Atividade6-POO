import java.util.Scanner;

public class Questao08 {


    public static boolean primo(int n){
        int cont = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                cont++;
            }
        }
        if (cont == 2){
            return true;
        }else {
            return false;
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor, se ele for primo [true], se não, [false].");
        int num = sc.nextInt();

        System.out.println(primo(num));
    }
}
