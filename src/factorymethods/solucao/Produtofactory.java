package factorymethods.solucao;

import factorymethods.Produto;
import factorymethods.ProdutoDigital;
import factorymethods.ProdutoFisico;
import factorymethods.TipoProdutoEnum;

public class Produtofactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {

        switch (tipoProdutoEnum){
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensaoFisica(true);
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensaoFisica(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de produto indisponivel ou inesistente");
        }

    }

}
