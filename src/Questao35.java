import java.util.Scanner;

public class Questao35 {


    public static String horario(String h){
        String[] partirHorario = h.split(":");
        String hora = partirHorario[0];
        String minutos = partirHorario[1];
        int converterHora = Integer.parseInt(hora);
        int converterMinutos = Integer.parseInt(minutos);

        if (converterHora >= 0 && converterHora <= 11 && converterMinutos >= 0 && converterMinutos <= 59){
            return "AM";
        }else if (converterHora >= 12 && converterHora <= 23 && converterMinutos >= 0 && converterMinutos <= 59) {
            return "PM";
        }else {
            return "Invalido!";
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um horario no formato hh:mm  ");
        String minhaHora = sc.nextLine();

        System.out.printf("%s %s ",minhaHora,  horario(minhaHora));



    }
}
