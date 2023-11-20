package prototype.solucao;

import prototype.Botao;

public class BotaoFactory {


    public static Botao getInstace(Botao prototipo) {

        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBordaEnum(prototipo.getTipoBordaEnum());
        return clone;

    }
}
