package factorymethods.problema;

import factorymethods.ProdutoDigital;
import factorymethods.ProdutoFisico;

// Nesse temos o problema de ter que sempre colocar a dimensão fisica, mesmo se for digital, tudo bem qeu poderiamos mudar
// mas temos que entender que as vezes vamso pegar o trem andando e como já esta em produção fica mais dificil.

public class TesteProblema {

    public static void main(String[] args) {

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensaoFisica(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensaoFisica(false);
    }

}
