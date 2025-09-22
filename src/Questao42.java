import java.util.Scanner;

public class Questao42 {


    public static int somaElevada(String n){
        int soma = 0;

        for (int i = 0; i < n.length(); i++){
            char caractere = n.charAt(i);
            int converter = Character.getNumericValue(caractere);
            double elevar = Math.pow(converter, 2);
            soma += elevar;
        }
        return soma;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        String num = sc.nextLine();


        System.out.printf("A soma dos algarimos do número elevados ao quadrado é [%d]", somaElevada(num));

    }
}
