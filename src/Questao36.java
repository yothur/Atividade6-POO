import java.util.Scanner;

public class Questao36 {


    public static String harshad(String n){
        int soma = 0;
        for (int i = 0; i < n.length(); i++){
            char caractere = n.charAt(i);
            int valor = Character.getNumericValue(caractere);
            soma += valor;
        }
        int numeroInteiro = Integer.parseInt(n);
        if (numeroInteiro % soma == 0){
            return "É um número de Harshad/Niven";
        }else {
            return "Não é um número de Harshad/Niven";
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        String numero = sc.nextLine();

        System.out.println(harshad(numero));


    }
}
