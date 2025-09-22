import java.util.Scanner;

public class Questao41 {


    public static boolean apenasNumeros(String s){
        int cont_letra = 0;
        for (int i = 0; i < s.length(); i++){
            char caractere = s.charAt(i);
            if (Character.isLetter(caractere)){
                cont_letra++;
            }
        }
        if (cont_letra == 1){
            return false;
        }else {
            return true;
        }
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Digite uma palavra, se tiver só números[true], se não, [false]: ");
        String num = sc.nextLine();

        System.out.println(apenasNumeros(num));

    }
}
