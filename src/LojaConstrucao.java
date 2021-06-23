
public abstract class LojaConstrucao {


    private String tipo;
    private double voltagem;
    private double watts;
    public LojaConstrucao(String tipo, double voltagem, double watts) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.watts = watts;
    }
}
