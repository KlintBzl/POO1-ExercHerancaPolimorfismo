
package atividadeextra8;

public abstract class Transporte {
    protected int capacidade;
    
    public Transporte(int capacidade){
        this.capacidade = capacidade;
    }
    
    public abstract void mover();
}
