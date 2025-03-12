
package atividadeextra8;

public class Navio extends Transporte{
    private double tonelagem;

    public Navio(int capacidade) {
        super(capacidade);
    }
    
    public void definirTonelagem(double tonelagem){
        this.tonelagem = tonelagem;
    }
    public void definirTonelagem(int tonelagem){
        this.tonelagem = tonelagem;
    }
    
    public void exibir(){
        System.out.println("Tonelagem: " + tonelagem);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("");
    }

    @Override
    public void mover() {
        System.out.println("O navio está se movendo!");
    }
  
}
