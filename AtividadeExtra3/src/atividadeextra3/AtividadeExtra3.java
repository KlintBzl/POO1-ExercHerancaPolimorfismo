package atividadeextra3;

public class AtividadeExtra3 {

    public static void main(String[] args) {
        Golfinho animal1 = new Golfinho("Oceano");
        animal1.definirSaltos(20);
        animal1.fazerSom();
        animal1.exibirInfo();
        Tubarao animal2 = new Tubarao("Profundezas do oceano");
        animal2.definirDentes(200);
        animal2.fazerSom();
        animal2.exibirInfo();
    }
}
