
public class Compras implements ObservadorEstoque {

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < 5) {
            System.out.println("[COMPRAS] ALERTA: O estoque do produto '" + nomeProduto
                    + "' está baixo (" + novaQuantidade + " unidades). Necessário repor.");
        }
    }
}
