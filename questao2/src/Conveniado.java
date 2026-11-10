public class Conveniado implements EstrategiaCobranca {

    private static final double VALOR_POR_HORA = 12.0;
    private static final double DESCONTO_PERCENTUAL = 0.25;

    @Override
    public double calcularValor(int minutos) {

        if (minutos <= 30) {
            return 0.0;
        }

        int minutosCobrados = minutos - 30;
        int horas = (minutosCobrados + 59) / 60;
        double valorBruto = horas * VALOR_POR_HORA;
    
        return valorBruto * (1.0 - DESCONTO_PERCENTUAL);
    }
}