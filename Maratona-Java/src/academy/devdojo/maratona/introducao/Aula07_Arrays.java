package academy.devdojo.maratona.introducao;

public class Aula07_Arrays {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 15;
        idades[1] = 13;
        idades[2] = 12;
        for(int i = 0 ; i < idades.length ; i++){
            System.out.println(idades[i]);
        }
    }
}
