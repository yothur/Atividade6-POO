public class Questao38 {



    public static int segundoMaior(){
        int[] vetor = new int[]{2,3,4,10,6,7,7};
        int maior = vetor[0];
        int segundoMaior = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] != maior){
                if (vetor[i] > segundoMaior){
                    segundoMaior = vetor[i];
                }
            }
        }
        return segundoMaior;
    }



    public static void main(String[] args) {

        System.out.printf("O segundo maior valor do vetor é %d", segundoMaior());

    }
}
