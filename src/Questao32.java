public class Questao32 {

    public static double mediaAritmetica(){
        double soma = 0;
        double[] media = new double[]{7,8,9,10};
        int quantidade = media.length;

        for (int i = 0; i < media.length; i++){
            soma += media[i];
        }
        return soma / quantidade;
    }

    public static void main(String[] args) {


        System.out.printf("A media aritmetica do vetor é: %.1f", mediaAritmetica());
    }
}
