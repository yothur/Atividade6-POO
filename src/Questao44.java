public class Questao44 {

    public static int[] novo(){
        int cont = 1;
        int[] inicio = new int[]{7};
        for (int i=1; i < inicio[0]; i++){
            cont++;
        }
        int[] novo = new int[cont];
        for (int i=1; i < inicio[0]; i++){
            novo[i] = i;
        }
        return novo;
    }


    public static void main(String[] args) {

        int[] vetorComMenoresQueOTotal = novo();

        for (int i = 1; i < vetorComMenoresQueOTotal.length; i++) {
            System.out.println(vetorComMenoresQueOTotal[i]);
        }
    }
}
