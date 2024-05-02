package main.list.OperacoesBasicas;

public class Item {
    private String nome;
    private Double preco;
    private int qtd;

    public Item(String nome, Double preco, Integer qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + qtd +
                '}';
    }

    public String getNome() {
        return this.nome;
    }

    public Double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
