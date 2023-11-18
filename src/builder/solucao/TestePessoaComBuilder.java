package builder.solucao;

import builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {

    // Fluencia de metodo, graças a retornar o objeto a gente consegue fazer isso
    public static void main(String[] args) {
        Pessoa pessoa =
                new PessoaBuilder()
                .nome("Victor")
                .sobreNome("Ferreira")
                .email("teste@gmail.com")
                .dataNascimento(LocalDate.of(2002, 11, 04))
                .criaPessoa();

        System.out.println(pessoa);
    }
}
