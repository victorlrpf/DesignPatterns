package singleton.problema;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    //Classe agenda
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    //Construtor da classe, com os dias onde TRUE são os dias disponiveis e FALSE os dias indisponiveis
    public Agenda(){
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terca", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
