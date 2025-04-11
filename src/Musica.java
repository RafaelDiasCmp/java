public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    float avaliacao;
    int numAvaliacoes;

    void ExibeFichaTecnica(){
        System.out.println(String.format("Título: %s", titulo));
        System.out.println(String.format("artista: %s", artista));
        System.out.println(String.format("Ano de Lancamento: %d", anoLancamento));
        System.out.println(String.format("Avaliação: %f", avaliacao));
        System.out.println(String.format("Número de Avaliações: %d", numAvaliacoes));
    }

    void avalia(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double obterMedia(){
        return avaliacao / numAvaliacoes;
    }
}
