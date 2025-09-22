import java.util.Scanner;

public class Questao39 {

    public static int contarPalavra(String p){
        String[] a = p.split(" ");
        return a.length;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite palavras separadas por espaço: ");
        String palavra = sc.nextLine();


        System.out.printf("A quantidade de palavras digitadas foi: %d", contarPalavra(palavra));
    }
}
