import java.util.Scanner;

public class Questao48 {

    public static String converterAno(int d){
        int anos = d / 365;
        int meses = (d % 365) / 30;
        int dias = d - (anos * 365) - (meses * 30);
        return String.format("%d dias equivale a %d ano(s) %d meses e %d dias", d, anos, meses, dias);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite uma quantidade de dias! ");
        int dias = sc.nextInt();

        System.out.println(converterAno(dias));



    }
}
