
public abstract class LojaConstrucao {


    private String tipo;
    private double voltagem;
    private double watts;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getWatts() {
        return watts;
    }

    public void setWatts(double watts) {
        this.watts = watts;
    }

    public LojaConstrucao(String tipo, double voltagem, double watts) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.watts = watts;
    }
}
