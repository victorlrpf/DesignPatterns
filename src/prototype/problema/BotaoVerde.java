package prototype.problema;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class BotaoVerde extends Botao {

    public BotaoVerde() {
        setCor("Verde");
        setAltura(26);
        setLargura(110);
        setTipoBordaEnum(TipoBordaEnum.GROSSA);
    }
}
