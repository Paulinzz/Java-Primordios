package academy.devdojo.maratona.introducao;

public class Aula05_EstruturaCondicionais3 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 5000D;
        String mensangem = "Doacao: 500 reais";
        String notmensagem = "Ainda não tenho condicao de doar!";
        //String resultado;
        // metodo comum:
        //if (salario > 5000) {
        //    resultado = mensangem;
        //}
        //else{
        //    resultado = notmensagem;
        //}

        // Usando Op. ternario
        String resultado = salario > 5000 ? mensangem : notmensagem;
        System.out.println(resultado);
    }

}
