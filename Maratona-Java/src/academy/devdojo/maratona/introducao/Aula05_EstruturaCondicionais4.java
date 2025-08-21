package academy.devdojo.maratona.introducao;

public class Aula05_EstruturaCondicionais4 {
    public static void main(String[] args) {
        //  $ 0 $ 34,712 9,7 %
        //  $ 34,713 $ 68,507 37,35%
        // $ 68,503 49.5%
        double salario = 50000D;
        if(salario <= 34.712){
            salario -= salario * 0.097;
        } else if(salario <= 68.507){
            salario -= salario * 0.375;
        }else{
            salario -= salario * 0.495;
        }
        System.out.println("salario líquido "+salario);

    }
}
