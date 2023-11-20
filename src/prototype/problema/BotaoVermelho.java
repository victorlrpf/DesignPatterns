package prototype.problema;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {

    public BotaoVermelho() {
        setCor("Vermelha");
        setAltura(30);
        setLargura(100);
        setTipoBordaEnum(TipoBordaEnum.FINA);
    }

}
