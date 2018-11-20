import java.util.Objects;

public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;

    public Contato(String nome, String sobrenome, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome()) &&
                Objects.equals(getSobrenome(), contato.getSobrenome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSobrenome());
    }

    @Override
    public String toString() {
        return  nome + " " +
                sobrenome + " - " +
                telefone;
    }
}
