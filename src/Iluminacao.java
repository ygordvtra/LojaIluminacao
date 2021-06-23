public class Iluminacao extends LojaConstrucao{
    public int getTempLuz() {
        return tempLuz;
    }

    public void setTempLuz(int tempLuz) {
        this.tempLuz = tempLuz;
    }

    private int tempLuz;


    public Iluminacao(String tipo, double voltagem, double watts, int tempLuz) {
        super(tipo, voltagem, watts);
        this.tempLuz = tempLuz;

    }
}
