
package atividadeextra;

public class Carro extends Veiculo{
    private String portas;
    protected int ano;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public void definirDetalhes(int ano){
        if(ano < 1886 || ano > 2025){
            System.out.println("o ano esta escrito errado");
        }else{
        this.ano = ano;
        }
    }
    public void definirDetalhes(String portas){
        this.portas = portas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + getModelo());
        System.out.println("Portas: " + portas);
        System.out.println("Ano: " + ano);
        System.out.println("===================================");
    }
}
