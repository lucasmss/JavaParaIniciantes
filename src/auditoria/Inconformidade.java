package auditoria;

public class Inconformidade {

    private String usuario;
    private String inconformidade;

    public Inconformidade(String usuario, String inconformidade) {
        this.usuario = usuario;
        this.inconformidade = inconformidade;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getInconformidade() {
        return inconformidade;
    }

    public void setInconformidade(String inconformidade) {
        this.inconformidade = inconformidade;
    }

    @Override
    public String toString() {
        return "{" +
                "usuario='" + usuario + '\'' +
                ", inconformidade='" + inconformidade + '\'' +
                '}';
    }
}
