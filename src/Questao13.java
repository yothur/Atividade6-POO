import java.util.Scanner;

public class Questao13 {

    public static String reverter(String a){
        String reversa = "";
        for (int i=a.length()-1; i >= 0; i--){
            char caractere = a.charAt(i);
            reversa += caractere;
        }
        if (a.equals(reversa)){
            return "É Palindromo";
        }else {
            return "Não é Palindromo";
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String minhaString =  sc.nextLine().toLowerCase();

        System.out.println(reverter(minhaString));

    }
}
