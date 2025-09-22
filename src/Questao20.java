import java.util.Scanner;

public class Questao20 {

    public static int somaNum(String n){
        int soma = 0;
        for (int i = 0; i < n.length(); i++){
            char caractere = n.charAt(i);
            int converter = Character.getNumericValue(caractere);
            soma += converter;
        }

        return soma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        String num = sc.nextLine();

        System.out.printf("A soma dos valores presentes em %s é %d!", num, somaNum(num));
    }
}
