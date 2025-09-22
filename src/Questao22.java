import java.util.Scanner;

public class Questao22 {


    public static String numeroBinario(int n){
        String binario = "";

        while (n > 0){
            int resto = n % 2;
            binario = resto + binario;
            n = n / 2;
        }
        return binario;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(numeroBinario(num));
    }

}
