public class Questao49 {


    public static String trocar(String a){
        String mudarA = a.replaceAll("a", "*");
        String mudarE = mudarA.replaceAll("e", "*");
        String mudarI = mudarE.replaceAll("i", "*");
        String mudarO = mudarI.replaceAll("o", "*");
        String mudarU = mudarO.replaceAll("u", "*");
        return mudarU;
    }

    public static void main(String[] args) {

        System.out.println(trocar("arthursempremelhoreateofim"));

    }
}
