package singleton.solucao;

import java.util.HashMap;
import java.util.Map;
//Aqui vamos fazer com que apenas uma agenda seja trabalhada na memoria e não de forma repetida igual antes.
public class AgendaSingletonEAGER {

    //Classe agenda
    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    //Construtor da classe, com os dias onde TRUE são os dias disponiveis e FALSE os dias indisponiveis
    private AgendaSingletonEAGER(){
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terca", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
    }

    public static AgendaSingletonEAGER getInstance() {
        return INSTANCE;
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
