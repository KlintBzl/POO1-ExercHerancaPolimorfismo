
package atividadeextra7;

public class AtividadeExtra7 {

    public static void main(String[] args) {
        Mago perso1 = new Mago(400);
        perso1.definirMana(500);
        perso1.atacar();
        
        Guerreiro perso2 = new Guerreiro(30);
        perso2.definirForca(6);
        perso2.atacar();
    }
    
}
