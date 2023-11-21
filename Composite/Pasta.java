import java.util.ArrayList;
import java.util.List;

public class Pasta implements ComponenteSistemaArquivos{
    private String nome;
    private List<ComponenteSistemaArquivos> elementos = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionarElemento(ComponenteSistemaArquivos c) {
        this.elementos.add(c);
    }

    public int obterTamanho() {
        int tamanho = 0;
        for (ComponenteSistemaArquivos c : this.elementos) {
            tamanho += c.obterTamanho();
        }
        return tamanho;
    }
}
