package atividadeextra4;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(double saldo) {
        super(saldo);
    }
        public void definirLimite(int limite){
        this.limite = limite;
    }

    @Override
    public void calcularJuros() {
        saldo *= 0.02;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

