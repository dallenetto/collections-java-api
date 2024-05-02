package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public static void main(String[] args) {

        CatalogoLivro catalogoLivro = new CatalogoLivro();

        catalogoLivro.adicionarLivro("livro 1", "autor a", 2020);
        catalogoLivro.adicionarLivro("livro 2", "autor b", 2021);
        catalogoLivro.adicionarLivro("livro 3", "autor b", 2022);
        catalogoLivro.adicionarLivro("livro 3", "autor a", 2023);

        System.out.println(catalogoLivro.pesquisarPorAutor("autor a"));

        System.out.println(catalogoLivro.pesquisarPorIntervaloAno(2020, 2023));
        System.out.println(catalogoLivro.pesquisarPorIntervaloAno(2021, 2022));

        System.out.println(catalogoLivro.pesquisaPorTitulo("livro 3"));
    }
    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()){
            for(Livro l : livroList ) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        } else {
            System.out.println("Não existem livros no catálogo.");
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();

        if (!livroList.isEmpty()){
            for(Livro l : livroList ) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal ) {
                    livrosPorIntervaloAno.add(l);
                }
            }
        } else {
            System.out.println("Não existem livros no catálogo.");
        }
        return livrosPorIntervaloAno;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livrosPorTitulo = null;

        if (!livroList.isEmpty()){
            for(Livro l : livroList ) {
                if (l.getTitulo().equalsIgnoreCase(titulo) ) {
                    return l;
                }
            }
        } else {
            System.out.println("Não existem livros no catálogo.");
        }

        System.out.println("Não existem livros com esse titulo.");
        return livrosPorTitulo;
    }

}
