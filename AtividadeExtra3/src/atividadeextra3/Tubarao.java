package atividadeextra3;

public class Tubarao extends AnimalMarinho{
    private int dentes;

    public Tubarao(String habitat) {
        super(habitat);
    }
    
    public void definirDentes(int dentes){
        this.dentes = dentes;
    }
    public void exibirInfo(){
        System.out.println("Habitat do tubarão: " + habitat);
        System.out.println("Dentes: " + dentes);
        System.out.println("=========================");
    }
    @Override
    public void fazerSom() {
        System.out.println("O tubarão não faz som... mas ele se comunica zigue-zagueando");
        System.out.println("----------------------------------------");
    }
}
