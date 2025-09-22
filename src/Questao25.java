import java.util.Scanner;

public class Questao25 {

    public static boolean capicua(String n){
        String revertido = "";
        for (int i = n.length()-1; i >= 0; i--){
            char numeros = n.charAt(i);
            revertido += numeros;
        }
        if (revertido.equals(n)){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número, se for um número capicua[true], se não [false]");
        String num = sc.nextLine();

        System.out.println(capicua(num));

    }
}
