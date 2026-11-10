
import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private int quantidade;
    private List<ObservadorEstoque> observadores;

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void setQuantidade(int novaQuantidade) {

        if (this.quantidade != novaQuantidade) {
            this.quantidade = novaQuantidade;
            notificarObservadores();
        }
    }

    private void notificarObservadores() {

        for (ObservadorEstoque observador : observadores) {
            observador.atualizar(this.nome, this.quantidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
