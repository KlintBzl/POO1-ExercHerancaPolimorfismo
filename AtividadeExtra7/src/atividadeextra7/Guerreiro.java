
package atividadeextra7;

public class Guerreiro extends Personagem{
    private int forca;

    public Guerreiro(int energia) {
        super(energia);
    }
    
    public void definirForca(int forca){
        this.forca = forca;
    }

    @Override
    public void atacar(){
        if(energia >= 60){
        System.out.println("O guerreiro ataca!");
        energia -= 60;
    }else{
            System.out.println("O guerreiro está muito cansado!");
        }
    }
}
