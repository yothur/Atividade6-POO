public class Questao27 {

    public static int[] iguais(){
        int indice = 0;
        int[] vetorPrincipal = new int[]{10,2,6,4,5,3,8};
        int[] vetorSecundario = new int[]{1,2,3,4,5,6,7};
        int[] vetorTerciario = new int[5];
        for (int i = 0; i < vetorPrincipal.length; i++){
            for (int j = 0; j < vetorPrincipal.length; j++) {
                if (vetorPrincipal[i] == vetorSecundario[j]){
                    vetorTerciario[indice] = vetorPrincipal[i];
                    indice++;
                }
            }
        }

        return vetorTerciario;
    }


    public static void main(String[] args) {

        int[] meuVetorTerciario = iguais();

        for (int i = 0; i < meuVetorTerciario.length; i++) {
            System.out.println(meuVetorTerciario[i]);
        }

    }
}
