package prototype.solucao;

import prototype.Botao;
import prototype.TipoBordaEnum;

public class TesteBotaoPrototype {

    public static void main(String[] args) {
        Botao botaoVerde = BotaoRegistry.getBotao("BOTAO_VERDE");
        System.out.println(botaoVerde);

        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        String chave =  "BOTAO_PRETO";
        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Preto");
        botaoPreto.setAltura(26);
        botaoPreto.setLargura(110);
        botaoPreto.setTipoBordaEnum(TipoBordaEnum.GROSSA);

        BotaoRegistry.addRegistry(chave, botaoPreto);

        Botao botaoPretoClone = BotaoRegistry.getBotao("BOTAO_PRETO");
        System.out.println(botaoPretoClone);
    }

}
