package singleton.solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Aqui vamos fazer com que apenas uma agenda seja trabalhada na memoria e não de forma repetida igual antes.
public class AgendaSingletonLAZY {

    //Classe agenda
    private static AgendaSingletonLAZY INSTANCE = null;
    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    //Construtor da classe, com os dias onde TRUE são os dias disponiveis e FALSE os dias indisponiveis
    private AgendaSingletonLAZY(){
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terca", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sabado", Boolean.TRUE);
    }

    //No LAZY ela cria uma instancia e verrifica se ela é null, se for ele atribui o valor e retorna, já nas outras vezes ele ja atribui o valor
    public static AgendaSingletonLAZY getInstance() {
        if (Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaSingletonLAZY();
            return INSTANCE;
        }
        return INSTANCE;
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
