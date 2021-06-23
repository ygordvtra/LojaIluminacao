public class LuzesDeTeto extends LojaConstrucao {

    // energia eletrica, wi-fi
    private double fonte;

    public LuzesDeTeto(String tipo, double voltagem, double watts, double fonte) {
        super(tipo, voltagem, watts);
        this.fonte = fonte;
    }
}
