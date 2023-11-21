public class TesteSistemaArquivos {
    public static void main(String[] args) {
        // Criar alguns arquivos
        ComponenteSistemaArquivos martelo = new Arquivo("Martelo", 100);
        ComponenteSistemaArquivos telefone = new Arquivo("Telefone", 50);
        ComponenteSistemaArquivos fone = new Arquivo("Fone", 25);
        ComponenteSistemaArquivos carregador = new Arquivo("Carregador", 250);
        ComponenteSistemaArquivos recibo = new Arquivo("Recibo", 75);   
        
        // Criar uma pasta e adicionar os arquivos a ela
        Pasta Fedex = new Pasta("Fedex");   
        Pasta caixa_martelo = new Pasta("caixa do martelo");
        Pasta caixa_dupla = new Pasta("caixa");
        Pasta caixa_fone_celular = new Pasta("caixa do fone e celular");
        Pasta caixa_carregador = new Pasta("caixa do carregador");
        
        Fedex.adicionarElemento(recibo);
        Fedex.adicionarElemento(caixa_martelo);
        Fedex.adicionarElemento(caixa_dupla);
        caixa_martelo.adicionarElemento(martelo);
        caixa_dupla.adicionarElemento(caixa_fone_celular);
        caixa_dupla.adicionarElemento(caixa_carregador);
        caixa_fone_celular.adicionarElemento(fone);
        caixa_fone_celular.adicionarElemento(telefone);
        caixa_carregador.adicionarElemento(carregador);


        // Testar o método obterTamanho
        int tamanhoTotal = Fedex.obterTamanho();
        int tamanhoCaixaMartelo = caixa_martelo.obterTamanho();
        int tamanhoCaixaDupla = caixa_dupla.obterTamanho();
        int tamanhoCaixaFoneCelular = caixa_fone_celular.obterTamanho();
        int tamanhoCaixaCarregador = caixa_carregador.obterTamanho();
        int tamanhoMartelo = martelo.obterTamanho();
        int tamanhoFone = fone.obterTamanho();
        int tamanhoTelefone = telefone.obterTamanho();
        int tamanhoCarregador = carregador.obterTamanho();
        int tamanhoRecibo = recibo.obterTamanho();

        System.out.println("Tamanho total: " + tamanhoTotal);
        System.out.println("Tamanho da caixa do martelo: " + tamanhoCaixaMartelo);
        System.out.println("Tamanho da caixa dupla: " + tamanhoCaixaDupla);
        System.out.println("Tamanho da caixa do fone e celular: " + tamanhoCaixaFoneCelular);
        System.out.println("Tamanho da caixa do carregador: " + tamanhoCaixaCarregador);
        System.out.println("Tamanho do martelo: " + tamanhoMartelo);
        System.out.println("Tamanho do fone: " + tamanhoFone);
        System.out.println("Tamanho do telefone: " + tamanhoTelefone);
        System.out.println("Tamanho do carregador: " + tamanhoCarregador);
        System.out.println("Tamanho do recibo: " + tamanhoRecibo);
    }
}