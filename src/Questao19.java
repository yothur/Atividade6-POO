public class Questao19 {

    public static int[] inteiros(){
        int soma = 0;
        int indice = 0;
        int[] primeiro = new int[]{1,2,3,4,5};
        int[] segundo = new int[]{6,7,8,9,10};
        int[] terceiro = new int[5];

        for (int i = 0; i < primeiro.length; i++){
            soma = primeiro[i] + segundo[i];
            terceiro[indice] = soma;
            indice++;
        }
        return terceiro;
    }


    public static void main(String[] args) {

        int[] meuTerceiroVetor = inteiros();

        for (int i = 0; i < meuTerceiroVetor.length; i++){
            System.out.println(meuTerceiroVetor[i]);
        }
    }
}
