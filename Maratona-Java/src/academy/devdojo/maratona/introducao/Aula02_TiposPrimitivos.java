package academy.devdojo.maratona.introducao;

public class Aula02_TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int)10000000000L;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 3200;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        String palavra = "variaveis strings cabem 1+ caractere.";
        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println("idade "+idade);
        System.out.println("explicacao string = "+ palavra);
    }
}