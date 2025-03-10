
package atividadeextra;

public class AtividadeExtra {

    public static void main(String[] args) {
        Carro veiculo1 = new Carro("Chevrolet", "Camaro");
        veiculo1.definirDetalhes("quatro portas");
        veiculo1.definirDetalhes(1966);
        veiculo1.exibirDetalhes();
        Moto veiculo2 = new Moto("Hyundai", "53");
        veiculo2.definirDetalhes(83);
        veiculo2.exibirDetalhes();
    }
    
}
