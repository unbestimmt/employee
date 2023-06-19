public class Concursado extends Funcionario {

    private int anosTrabalho;

    public Concursado(String nome, double salarioBase, int anosTrabalho) {
        super(nome, salarioBase);
        this.anosTrabalho = anosTrabalho;
    }

    public int getAnosTrabalho() {
        return anosTrabalho;
    }

    @Override
    protected double getGratificacao() {
        int x = anosTrabalho / 5;
        return x * (salarioBase * 0.02);
    }

}
