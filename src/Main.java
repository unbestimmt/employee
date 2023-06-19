import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        var joao = new Concursado("João", 4000, 5);
        var jose = new Temporario("José", 2000,12);
        var maria = new Concursado("Maria", 2400, 34);
        var pedro = new Temporario("Pedro", 1200, 10);

        funcionarios.add(joao);
        funcionarios.add(jose);
        funcionarios.add(maria);
        funcionarios.add(pedro);

        for (Funcionario funcionario : funcionarios) {
            System.out.print(funcionario.getNome() + ", salário de R$ " + funcionario.getSalario() + ", ");
            if (funcionario instanceof Concursado) {
                System.out.print("concursado(a), " + ((Concursado) funcionario).getAnosTrabalho() + " anos de trabalho.\n");
            } else {
                System.out.print("temporário(a), " + ((Temporario) funcionario).getMesesContrato() + " meses de contrato.\n");
            }
        }

    }

}
