public class Main {
    public static void main(String[] args) {
        int tempoPermanencia = 125;

        EstrategiaCobranca rotativo = new Rotativo();
        EstrategiaCobranca mensalista = new Mensalista();
        EstrategiaCobranca conveniado = new Conveniado();

        Tiquete tiqueteRotativo = new Tiquete("ABC-1234", tempoPermanencia, rotativo);
        Tiquete tiqueteMensalista = new Tiquete("ABC-1234", tempoPermanencia, mensalista);
        Tiquete tiqueteConveniado = new Tiquete("ABC-1234", tempoPermanencia, conveniado);

        System.out.println("Tempo de permanência: " + tempoPermanencia + " minutos");
        System.out.println("Valor Perfil Rotativo: R$ " + tiqueteRotativo.calcularValor());
        System.out.println("Valor Perfil Mensalista: R$ " + tiqueteMensalista.calcularValor());
        System.out.println("Valor Perfil Conveniado: R$ " + tiqueteConveniado.calcularValor());

        System.out.println("\nDemonstrando a troca de perfil em tempo de execução para o mesmo tíquete:");
        Tiquete tiqueteDinamico = new Tiquete("XYZ-9876", 90, rotativo);
        System.out.println("Placa: " + tiqueteDinamico.getPlaca() + " | Tempo: 90 min | Perfil Inicial (Rotativo): R$ " + tiqueteDinamico.calcularValor());

        tiqueteDinamico.setEstrategia(conveniado);
        System.out.println("Trocado para Conveniado: R$ " + tiqueteDinamico.calcularValor());

        tiqueteDinamico.setEstrategia(mensalista);
        System.out.println("Trocado para Mensalista: R$ " + tiqueteDinamico.calcularValor());
    }
}