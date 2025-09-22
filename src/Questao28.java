import java.util.Scanner;

public class Questao28 {


    public static String data(String d, String m, String a){
        int dia = Integer.parseInt(d);
        int mes = Integer.parseInt(m);
        int ano = Integer.parseInt(a);
        if (dia < 0 || dia > 31) {
            return "Data Invalida!";
        }if (mes < 0 || mes > 12) {
            return "Data Invalida!";
        }if (ano < 1920 || ano > 2025) {
            return "Data Invalida!";
        }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia == 31) {
                return "Data Invalida!";
            }else {
                return "Data valida!";
            }
        }else if (mes == 2) {
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                if (dia > 29) {
                    return "Data Invalida!";
                }else {
                    return "Data valida!";
                }
            }else if (dia > 28) {
                return "Data Invalida!";
            }else {
                return "Data valida!";
            }
        }else {
            return "Data valida!";
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma data no formato dd/aa/aaaa:");
        String data = sc.nextLine();
        String[] dataSeparada = data.split("/");
        String dia = dataSeparada[0];
        String mes = dataSeparada[1];
        String ano = dataSeparada[2];

        System.out.println(data(dia, mes, ano));


    }
}
