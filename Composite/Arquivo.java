public class Arquivo implements ComponenteSistemaArquivos {
    public String nome;
    public int tamanho;

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public int obterTamanho() {
        return tamanho;
    }
}