public class Questao10 {

    public static int vetor_int(){
        int[] vetor = new int[]{3,4,5,6,7};
        int maior = 0;
        for (int i=0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }



    public static void main(String[] args) {

        System.out.printf("O maior valor no vetor é %d", vetor_int());
    }
}
