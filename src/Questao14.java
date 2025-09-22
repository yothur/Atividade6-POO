import java.util.Scanner;

public class Questao14{

    public static int[] ordenar(){
        int[] valores = new int[]{2,5,7,9,3};

        int pos = 0;

        for (int i = 0; i < valores.length; i++){
            for (int j = 0; j < valores.length; j++){
                if (valores[i] < valores[j]){
                    pos = valores[i];
                    valores[i] = valores[j];
                    valores[j] = pos;
                }
            }
        }
        return valores;
    }

    public static void main(String[] args) {

        int[] valores_ordenados = ordenar();

        for (int i = 0; i < valores_ordenados.length; i++){
            System.out.printf("%d -> ", valores_ordenados[i]);
        }


    }
}
