package academy.devdojo.maratona.introducao;

public class Aula06_EstruturaRepeticao04 {
    public static void main(String[] args) {
        // dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
       // condicao valorParcela >= 1000
        double carro = 30000D;
        for (int parcela = 1; parcela <= carro ; parcela++) {
            double valorParcela = carro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ "+ valorParcela);
            }
            
        }
    }

