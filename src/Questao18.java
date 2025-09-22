public class Questao18 {

    public static int[] inteiros(){
        int cont = 0;
        int[] principal = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < principal.length; i++){
            if (principal[i] % 2 == 0){
                cont += 1;
            }
        }
        int[] pares = new int[cont];
        int indice = 0;
        for (int i = 0; i < principal.length; i++){
            if (principal[i] % 2 == 0){
                pares[indice] = principal[i];
                indice++;
            }
        }

        return pares;
    }


    public static void main(String[] args) {

        int[] meusPares = inteiros();

        for (int i = 0; i < meusPares.length; i++){
            System.out.println(meusPares[i]);
        }
    }
}
