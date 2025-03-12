package atividadeextra4;

public class AtividadeExtra4 {

    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca(2000);
        conta1.definirTaxa(500);
        conta1.calcularJuros();
        ContaCorrente conta2 = new ContaCorrente(3000);
        conta2.definirLimite(1000);
        conta2.calcularJuros();
        conta1.exibirSaldo();
    }
    
}
