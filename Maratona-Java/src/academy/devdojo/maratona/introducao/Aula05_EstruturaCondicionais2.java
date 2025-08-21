package academy.devdojo.maratona.introducao;

public class Aula05_EstruturaCondicionais2 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < categoria juvenil
        // idade > = 18 categoria adulto

        int idade = 13;
        if(idade < 15){
            System.out.println("Categoria Infantil");
        }
        else if(idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        } else{
            System.out.println("Categoria Adulto");

        }
    }
}
