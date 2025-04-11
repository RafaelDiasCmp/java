public class MusicaPrincipal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Lêmure";
        minhaMusica.anoLancamento = 2020;
        minhaMusica.artista = "Vicente";

        minhaMusica.avalia(8);
        minhaMusica.avalia(5);
        minhaMusica.avalia(6);

        double media = minhaMusica.obterMedia();

        System.out.println(minhaMusica.titulo);
        System.out.println(minhaMusica.anoLancamento);
        System.out.println(minhaMusica.artista);
        System.out.println(media);


    }
}
