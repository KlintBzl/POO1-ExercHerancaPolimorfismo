
package atividadeextra2;

public class AtividadeExtra2 {

    public static void main(String[] args) {
        Gerente funcionario1 = new Gerente("Antonio", 5000);
        funcionario1.definirBonus(300);
        funcionario1.calcularSalario();
        Desenvolvedor funcionario2 = new Desenvolvedor("Carlos");
        funcionario2.definirHorasTrabalhadas(60);
        funcionario2.calcularSalario();
    }
    
}
