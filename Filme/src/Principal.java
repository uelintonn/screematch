import br.com.uelinton.screematch.modelos.Movie;
import br.com.uelinton.screematch.modelos.Series;

public class Principal {
    public static void main(String[] args) {
        Movie HomemAranha = new Movie();
        HomemAranha.setNome("A Pedra filosofal do homem aranha") ;
        HomemAranha.setAnoDeLancamento(2021);

        HomemAranha.setDuracaoEmMinutos(180);

        HomemAranha.exibeFichaTecnica();
        HomemAranha.avalia(10);
        HomemAranha.avalia(3);
        HomemAranha.avalia(9);

        System.out.println(HomemAranha.pegaMedia());
        Series lost = new Series();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.getEpisodiosPorTemporada(10)
    }

    }

