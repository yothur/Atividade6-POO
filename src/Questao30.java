import java.util.Scanner;

public class Questao30 {


    public static String substituir(String a){
        a = a.replaceAll(" ", "-");
        return a;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine();

        System.out.println(substituir(palavra));
    }
}
