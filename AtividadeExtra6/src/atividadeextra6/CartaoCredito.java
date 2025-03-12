package atividadeextra6;

public class CartaoCredito extends Pagamento{
    private double limite;

    public CartaoCredito(double valor) {
        super(valor);
    }
    
    public void definirLimite(int limite){
        this.limite = limite;
    }

    public void definirLimite(double limite){
        this.limite = limite;
    }

    @Override
    public void processarPagamento() {
        if(valor > limite){
            System.out.println("O pagamento excede o limite do cartão!");
        } else {
            System.out.println("Pagamento realizado com sucesso!");
        }
    }
}
