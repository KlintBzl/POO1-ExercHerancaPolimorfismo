
package atividadeextra8;

public class Aviao extends Transporte{
    private int altitudeMaxima;

    public Aviao(int capacidade) {
        super(capacidade);
    }
    
    public void definirAltitude(int altitudeMax){
        this.altitudeMaxima = altitudeMax;
    }
    
    public void exibir(){
        System.out.println("Altitude máxima: " + altitudeMaxima);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("");
    }

    @Override
    public void mover(){
        System.out.println("O aviao está se movendo!");
    }
}
