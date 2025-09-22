import java.util.Arrays;
import java.util.Scanner;

public class Questao43 {

    public static String ordem(String s){
        char[] caracteres = s.toCharArray();
        Arrays.sort(caracteres);
        String textoOrdenado = new String(caracteres);
        return textoOrdenado;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.next();

        System.out.printf("Sua String em ordem alfabetica é %s", ordem(palavra));

    }
}
