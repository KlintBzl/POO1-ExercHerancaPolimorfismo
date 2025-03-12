package atividadeextra6;

public class AtividadeExtra6 {

    public static void main(String[] args) {
        CartaoCredito cartao1 = new CartaoCredito(588);
        cartao1.definirLimite(600);
        cartao1.processarPagamento();
        
        Boleto boleto1 = new Boleto(700, 600);
        boleto1.definirCodigo("9o5683p");
        boleto1.processarPagamento();
    }
    
}
