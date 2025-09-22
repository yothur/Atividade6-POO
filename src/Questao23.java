import java.util.Scanner;

public class Questao23 {

    public static int contadorVogal(String palavra){
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++){
            char caractere = palavra.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u'){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um String:");
        String string = sc.nextLine();

        System.out.printf("Essa String possui %d vogais!", contadorVogal(string));
    }
}
