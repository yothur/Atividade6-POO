import java.util.Scanner;

public class Questao04 {

    public static int tabuda(int n){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n",n, i, i*n);
        }
        return 0;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número pra saber a sua tabuada:");
        int num = sc.nextInt();

        tabuda(num);
    }
}
