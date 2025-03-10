
package atividadeextra3;

public class Tubarao extends AnimalMarinho{
    
    private int dentes;
    
    public void definirDentes(int dentes){
        this.dentes = dentes;
    }
    @Override
    public void fazerSom() {
        System.out.println("O tubarão não faz som... mas ele se comunica zigue-zagueando");
    }
    
}
