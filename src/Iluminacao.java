public class Iluminacao extends LojaConstrucao{
    private int tempLuz;


    public Iluminacao(String tipo, double voltagem, double watts, int tempLuz) {
        super(tipo, voltagem, watts);
        this.tempLuz = tempLuz;

    }
}
