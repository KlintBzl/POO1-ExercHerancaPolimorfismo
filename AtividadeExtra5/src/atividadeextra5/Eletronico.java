
package atividadeextra5;

public abstract class Eletronico {
    protected String marca;
    
    public Eletronico(String marca){
        this.marca = marca;
    }
    public abstract boolean ligar();
}
