package builder.problema;

import builder.Pessoa;

import java.time.LocalDate;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "Victor",
                "Ferreira",
                "teste@gmail.com",
                "victao",
                LocalDate.of(2002,11,04));


        System.out.println(pessoa);
    }
}
