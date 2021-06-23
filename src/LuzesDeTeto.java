public class LuzesDeTeto extends LojaConstrucao {

    // energia eletrica, wi-fi
    private double fonte;

    public double getFonte() {
        return fonte;
    }

    public void setFonte(double fonte) {
        this.fonte = fonte;
    }

    public LuzesDeTeto(String tipo, double voltagem, double watts, double fonte) {
        super(tipo, voltagem, watts);
        this.fonte = fonte;
    }
}
