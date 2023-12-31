package factorymethods;

import java.math.BigDecimal;

public class Produto {

    private String descricao;
    private BigDecimal preco;
    private Boolean possuiDimensaoFisica;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getPossuiDimensaoFisica() {
        return possuiDimensaoFisica;
    }

    public void setPossuiDimensaoFisica(Boolean possuiDimensaoFisica) {
        this.possuiDimensaoFisica = possuiDimensaoFisica;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", possuiDimensaoFisica=" + possuiDimensaoFisica +
                '}';
    }
}
