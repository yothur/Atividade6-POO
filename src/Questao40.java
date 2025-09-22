public class Questao40 {


    public static int[] primos(){
        int indice = 0;
        int[] vetor = new int[]{3,4,5,6,7,8,9};
        int[] primos= new int[3];
        for (int i = 0; i < vetor.length; i++){
            int cont = 0;
            for (int j = 1; j <= vetor[i]; j++) {
                if (vetor[i] % j == 0){
                    cont++;
                }
            }
            if (cont == 2){
                primos[indice] = vetor[i];
                indice++;
            }
        }
        return primos;
    }

    public static void main(String[] args) {

        int[] meuVetorComPrimos = primos();

        for (int i = 0; i < meuVetorComPrimos.length; i++) {
            System.out.println(meuVetorComPrimos[i]);
        }

    }
}
