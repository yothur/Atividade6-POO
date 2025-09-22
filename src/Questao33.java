import java.util.Scanner;

public class Questao33 {


    public static boolean anagrama(String palavra){
        if (palavra.length() == 4){
            if (palavra.contains("a") && palavra.contains("m") && palavra.contains("o") && palavra.contains("r")) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um palavra, se for anagrama de amor [true], se não, [false]: ");
        String minhaPalavra = sc.nextLine();

        System.out.println(anagrama(minhaPalavra));



    }
}
