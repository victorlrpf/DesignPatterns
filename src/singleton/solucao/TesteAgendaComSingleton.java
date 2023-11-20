package singleton.solucao;

import singleton.problema.Agenda;

public class TesteAgendaComSingleton {

    public static void main(String[] args) {
        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sabado");
    }

    public static void reservaDiaEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaLAZY(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaENUM(String dia) {
        AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
