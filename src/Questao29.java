import java.util.Scanner;

public class Questao29 {


    public static String horas(int s){
        int horas = s / 3600;
        int minutos = ((s - (horas * 3600)) / 60);
        int segundos = s % 60;
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma quantidade de segundos:");
        int segundos = sc.nextInt();

        System.out.println(horas(segundos));
    }
}
