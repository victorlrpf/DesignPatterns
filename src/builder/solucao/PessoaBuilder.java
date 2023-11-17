package builder.solucao;

import java.time.LocalDate;

public class PessoaBuilder {

    private String nome;

    private String sobreNome;

    private String email;

    private String apelido;

    private LocalDate dataNascimento;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder sobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
        return this;
    }

    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }
}
