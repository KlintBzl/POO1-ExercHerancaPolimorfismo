
package atividadeextra8;

public class AtividadeExtra8 {

    public static void main(String[] args) {
        Navio trans1 = new Navio(200);
        trans1.definirTonelagem(88.5);
        trans1.mover();
        trans1.exibir();
        
        Aviao trans2 = new Aviao(50);
        trans2.definirAltitude(80);
        trans2.mover();
        trans2.exibir();
    }
    
}
