public abstract class Funcionario {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salarioBase + getGratificacao();
    }

    protected abstract double getGratificacao();

}
