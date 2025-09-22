import java.util.Scanner;

public class Questao45 {

    public static int inverter(String n){
        String inicio = "";
        for (int i = n.length()-1; i >= 0; i--){
            char caractere = n.charAt(i);
            inicio += caractere;
        }
        int converter = Integer.parseInt(inicio);
        return converter;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        String num = sc.next();

        System.out.printf("O número invertido é %d", inverter(num));

    }
}
