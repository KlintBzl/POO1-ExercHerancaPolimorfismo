package atividadeextra3;

public class Golfinho extends AnimalMarinho{
    private double saltos;

    public Golfinho(String habitat) {
        super(habitat);
    }
    
    public void definirSaltos(int saltos){
        this.saltos = saltos;
    }
    public void definirSaltos(double saltos){
        this.saltos = saltos;
    }
    
    public void exibirInfo(){
        System.out.println("Habitat do golfinho: " + habitat);
        System.out.println("Saltos: " + saltos);
        System.out.println("=========================");
    }
    
    @Override
    public void fazerSom() {
        System.out.println("O golfinho está assoviando e clicando!");
        System.out.println("----------------------------------------");
    }
}
