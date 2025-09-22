import java.util.Scanner;

public class Questao05 {


    public static String meu_nome(String nome){
        return "Olá, " + nome;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String seuNome = sc.nextLine();

        System.out.println(meu_nome(seuNome));
    }
}
