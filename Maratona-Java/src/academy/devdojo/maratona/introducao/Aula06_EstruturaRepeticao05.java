package academy.devdojo.maratona.introducao;

public class Aula06_EstruturaRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000D;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
