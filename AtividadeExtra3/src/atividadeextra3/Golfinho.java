
package atividadeextra3;

public class Golfinho extends AnimalMarinho{
    private double saltos;
    
    public void definirSaltos(int saltos){
        this.saltos = saltos;
    }
    public void definirSaltos(double saltos){
        this.saltos = saltos;
    }
    
    @Override
    public void fazerSom() {
        System.out.println("O golfinho está assoviando e clicando!");
    }
    
    
}
