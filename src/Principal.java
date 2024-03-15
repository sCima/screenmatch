import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Carros");
        meuFilme.setAnoLancamento(2009);
        meuFilme.setDuracaoEmMinutos(120);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        meuFilme.avalia(5);
        System.out.printf("Total de avaliações: %d %n",meuFilme.getTotalDeAvaliacoes());
        System.out.printf("Média de avaliações: %.2f %n",meuFilme.pegaMedia());
        System.out.printf("Duração do filme: %d %n", meuFilme.getDuracaoEmMinutos());

        Serie flash = new Serie();
        flash.setNome("The Flash");
        flash.setAnoLancamento(2018);
        flash.setTemporadas(6);
        flash.setEpisodioPorTemporada(24);
        flash.setMinutosPorEpisodio(43);
        System.out.printf("Tempo para maratonar %s: %d minutos. %n", flash.getNome(), flash.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(flash);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(flash);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoRods = new Filme();
        filmeDoRods.setDuracaoEmMinutos(200);
        filmeDoRods.setNome("Dogville");
        filmeDoRods.setAnoLancamento(2003);
        filmeDoRods.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoRods);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.getFirst().getNome());

    }
}