import java.util.Arrays;

public class Questao26 {


    public static int[] semRepetir(){
        int indice = 0;
        int[] principal = new int[]{2,7,3,4,5,6,6,2,9,9};
        Arrays.sort(principal);
        int[] novo = new int[7];
        novo[indice] = principal[0];
        int maior = principal[0];
        for (int i = 0; i < principal.length; i++){
           if (principal[i] > maior){
               novo[indice+1] = principal[i];
               indice++;
               maior = principal[i];
           }
        }

        return novo;
    }


    public static void main(String[] args) {

        int[] meuVetor = semRepetir();

        for (int i = 0; i < meuVetor.length; i++) {
            System.out.println(meuVetor[i]);
        }
    }
}
