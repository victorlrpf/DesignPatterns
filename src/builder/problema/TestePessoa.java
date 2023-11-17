package builder.problema;

import builder.Pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "Victor",
                "Ferreira",
                "teste@gmail.com",
                "victao",
                "04/11/2002");

        System.out.println(pessoa);
    }
}
