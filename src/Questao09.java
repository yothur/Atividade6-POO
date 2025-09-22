public class Questao09 {

    public static int vetor_int(){
        int[] vetor = new int[]{3,4,5,6,7};
        int soma = 0;
        for (int i=0; i < vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }



    public static void main(String[] args) {

        System.out.printf("A soma dos valores no vetor é %d", vetor_int());
    }
}
