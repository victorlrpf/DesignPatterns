package builder;

public class Pessoa {

    private String nome;

    private String sobreNome;

    private String email;

    private String apelido;

    private String dataNascimento;

    // Constructor

    public Pessoa(String nome, String sobreNome, String email, String apelido, String dataNascimento) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }

    // Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // ToSting

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
