import java.util.ArrayList;
import java.util.Scanner;

public class Questao46 {


    public static boolean fibonacci(int n){
        ArrayList<Integer> fibo = new ArrayList<>();
        int inicio = 0;
        int meio = 1;
        int proximo = inicio + meio;
        fibo.add(inicio);
        fibo.add(meio);
        fibo.add(proximo);
        int cont = 0;
        while (cont <= n-2){
            inicio = meio;
            meio = proximo;
            proximo = inicio + meio;
            fibo.add(proximo);
            cont++;
        }
        for (int i = 0; i < fibo.size(); i++) {
            if (fibo.get(i) == n){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número pra saber se ele está presente na sequencia de fibonacci");

        int num = sc.nextInt();

        System.out.println(fibonacci(num));



    }
}
