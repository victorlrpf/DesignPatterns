package factorymethods.solucao;

import factorymethods.Produto;
import factorymethods.TipoProdutoEnum;

public class TesteProdutoComFactoryMethod {

    public static void main(String[] args) {

        Produto produtoDigital = Produtofactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = Produtofactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoFisico);
        System.out.println(produtoDigital);

    }
}
