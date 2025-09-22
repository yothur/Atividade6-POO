public class Questao47 {


    public static boolean comparar(){
        int cont = 0;
        int[] vetor1 = new int[]{1,2,3,4,5,7};
        int[] vetor2 = new int[]{1,2,3,4,5,7};

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == vetor2[i]){
                cont++;
            }
        }
        if (cont == 6){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.printf("Se o vetor for igual [true], se nao, [false] -> %b", comparar());
    }
}
