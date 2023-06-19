public class Temporario extends Funcionario {

    private int mesesContrato;

    public Temporario(String nome, double salarioBase, int mesesContrato) {
        super(nome, salarioBase);
        this.mesesContrato = mesesContrato;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    @Override
    public double getGratificacao() {
        return mesesContrato * 100;
    }
}
