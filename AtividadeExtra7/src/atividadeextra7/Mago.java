
package atividadeextra7;

public class Mago extends Personagem{
    private double mana;

    public Mago(int energia) {
        super(energia);
    }
    
    public void definirMana(double mana){
        this.mana = mana;
    }
    public void definirMana(int mana){
        this.mana = mana;
    }

    @Override
    public void atacar() {
        if(mana >= 30){
            System.out.println("O mago ataca!");
        mana -= 30;
        }else{
            System.out.println("Mana insuficiente!");
        }
    }
}
