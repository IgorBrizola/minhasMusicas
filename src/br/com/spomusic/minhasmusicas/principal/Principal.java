package br.com.spomusic.minhasmusicas.principal;

import br.com.spomusic.minhasmusicas.modelos.MinhasPreferidas;
import br.com.spomusic.minhasmusicas.modelos.Musica;
import br.com.spomusic.minhasmusicas.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {


        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Paris");
        minhaMusica.setCantor("Derek");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
                minhaMusica.curti();
        }


        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("PodPah");
        meuPodcast.setApresentador("Igão");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curti();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
