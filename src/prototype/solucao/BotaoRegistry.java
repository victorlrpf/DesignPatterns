package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;
import prototype.problema.BotaoAzul;
import prototype.problema.BotaoVerde;
import prototype.problema.BotaoVermelho;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry  {

    private static BotaoRegistry botaoRegistry;

    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static {
        Botao botaoAzl = new BotaoAzul();
        botaoAzl.setCor("Azul");
        botaoAzl.setAltura(35);
        botaoAzl.setLargura(125);
        botaoAzl.setTipoBordaEnum(TipoBordaEnum.TRACEJADA);

        Botao botaoVermelho = new BotaoVermelho();
        botaoVermelho.setCor("Vermelha");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBordaEnum(TipoBordaEnum.FINA);

        Botao botaoVerde = new BotaoVerde();
        botaoVerde.setCor("Verde");
        botaoVerde.setAltura(26);
        botaoVerde.setLargura(110);
        botaoVerde.setTipoBordaEnum(TipoBordaEnum.GROSSA);

        REGISTRY.put("BOTAO_AZUL", botaoAzl);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
        REGISTRY.put("BOTAO_VERDE", botaoVerde);
    }

    public static BotaoRegistry getInstance(){
        if (Objects.isNull(botaoRegistry)) {
            botaoRegistry = new BotaoRegistry();
            return  botaoRegistry;
        }
        return botaoRegistry;
    }

    public static Botao getBotao(String chave) {
        return BotaoFactory.getInstace(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave, botao);
    }

}
