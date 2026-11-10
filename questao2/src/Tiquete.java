public class Tiquete {
    private String placa;
    private int minutos;
    private EstrategiaCobranca estrategia;

    public Tiquete(String placa, int minutos, EstrategiaCobranca estrategia) {
        this.placa = placa;
        this.minutos = minutos;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaCobranca estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValor() {
        return estrategia.calcularValor(minutos);
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}