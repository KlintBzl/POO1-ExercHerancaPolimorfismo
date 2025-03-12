package atividadeextra6;

public class Boleto extends Pagamento{
    private String codigoBarras;
    private double valorBoleto;

    public Boleto(double valor, double valorBoleto) {
        super(valor);
        this.valorBoleto = valorBoleto;
    }
    
    public void definirCodigo(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
       if(valor == valorBoleto){
           System.out.println("Pagamento realizado com sucesso!");
       }else if(valor < valorBoleto){
           System.out.println("O valor do pagamento não é o suficiente para pagar o boleto!");
       }else{
           System.out.println("O valor do pagamento excede o valor do boleto!");
       }
    }
}
