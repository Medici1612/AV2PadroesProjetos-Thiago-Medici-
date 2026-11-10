public class Rotativo implements EstrategiaCobranca {
    private static final double VALOR_POR_HORA = 12.0;

    @Override
    public double calcularValor(int minutos) {
        if (minutos <= 0) {
            return 0.0;
        }
        int horas = (minutos + 59) / 60;
        return horas * VALOR_POR_HORA;
    }
}