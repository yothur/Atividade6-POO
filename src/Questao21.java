import java.util.Scanner;

public class Questao21 {

    public static boolean Armstrong(String n){
        int tamanho = n.length();
        int num = Integer.parseInt(n);

        int soma = 0;

        for (int i = 0; i < n.length(); i++){
            char caractere = n.charAt(i);
            int converter = Character.getNumericValue(caractere);
            double elevar = Math.pow(converter, tamanho);
            soma += elevar;
        }

        if (soma == num){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor se for um numero de Armnstrong [true], se não, [false]:");
        String valor = sc.nextLine();

        System.out.println(Armstrong(valor));
    }
}
