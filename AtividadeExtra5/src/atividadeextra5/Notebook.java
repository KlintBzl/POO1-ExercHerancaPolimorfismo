
package atividadeextra5;

public class Notebook extends Eletronico{
    private int ram;
    private boolean ligado;

    public Notebook(String marca, boolean ligado) {
        super(marca);
        this.ligado = ligado;
    }
    
    public void definirRam(int ram){
        this.ram = ram;
    }

    @Override
    public boolean ligar() {
        if(ligado == false){
            System.out.println("Ligando o computador!");
            ligado = true;
        }else{
            System.out.println("Desligando o computador!");
            ligado = false;
        }
        return ligado;
    }
}
