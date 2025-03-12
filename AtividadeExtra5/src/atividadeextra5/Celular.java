
package atividadeextra5;

public class Celular extends Eletronico{
    private double tela;
    private boolean ligado;

    public Celular(String marca) {
        super(marca);
    }
    
    public void definirTela(double tela){
        this.tela = tela;
    }
    
    public void definirTela(int tela){
        this.tela = tela;
    }

    @Override
    public boolean ligar() {
        if(ligado == false){
            System.out.println("Ligando o celular!");
            ligado = true;
        }else{
            System.out.println("Desligando o celular!");
            ligado = false;
        }
        return ligado;
    }
            
}
