package array;

public class Empregado {
    private Integer id;
    private String nome;
    private Double salario;

    public Empregado() {
    }

    public Empregado(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void porcentoSalario(Double percent) {
        salario += ((percent/100) * salario);
    }

    @Override
    public String toString() {
        return "Empregado{ " +
                "nome='" + nome + '\'' +
                ", salario=" + String.format("%.2f", salario) +
                '}';
    }
}
