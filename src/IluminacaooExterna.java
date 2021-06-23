public class IluminacaooExterna extends LojaConstrucao {

    //Holofote, Refletor, Luminária Solar
    public String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public IluminacaooExterna(String tipo, double voltagem, double watts, String modelo) {
        super(tipo, voltagem, watts);
        this.modelo = modelo;
    }
}
