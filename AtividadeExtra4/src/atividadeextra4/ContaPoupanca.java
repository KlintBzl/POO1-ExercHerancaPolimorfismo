package atividadeextra4;

public class ContaPoupanca extends Conta{
    private double taxaRendimento;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    
    public void definirTaxa(double taxa){
        this.taxaRendimento = taxa;
    }
    public void definirTaxa(int taxa){
        this.taxaRendimento = taxa;
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
